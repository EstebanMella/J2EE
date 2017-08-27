/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sahian
 */
@WebServlet(name = "VerCookies", urlPatterns = {"/VerCookies"})
public class VerCookies extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VerCookies</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VerCookies at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         Cookie [] cookies = request.getCookies();
         int precioTotal=0;

        PrintWriter pw= response.getWriter();
            pw.println("<!DOCTYPE html>");
            pw.println("<html>");
            pw.println("<head>");
            pw.println("<title>Carrito</title>");
            pw.println("<link rel="+"stylesheet"+" type="+"text/css"+" href="+"css/style.css"+">");
            pw.println("</head>");

            pw.println("<body link="+"#ffffcc"+" vlink="+"#ffffcc"+" alink="+"#ffffcc"+">");
            pw.println("<div id="+"cabecera"+">");
            pw.println("<div id="+"logo"+"></div>");

		pw.println("<div id="+"menu"+">");
			pw.println("<ul>");
			pw.println("<ul class="+"claseLista"+">");
				pw.println("<li><a href="+"login.jsp"+">Login</a></li>");
                                pw.println("<li><a href="+"registro.jsp"+">Registarse</a></li>");
				pw.println("<li><a href="+"index.jsp"+">Home</a></li>");
			pw.println("</ul>");
		pw.println("</div>");

	pw.println("</div>");
/*

	pw.println("<div id="+"latiz"+">");
		pw.println("<ul class="+"listaIz"+">");
			pw.println("<li>Item I</li>");
			pw.println("<li>Item II</li>");
			pw.println("<li>Item III</li>");
			pw.println("<li>Item IV</li>");
		pw.println("</ul>");
	pw.println("</div>");*/
         pw.println("<div id="+"central"+">");
         pw.println("<div id="+"central"+">");
            pw.println("<title>Carrito</title>");
             pw.println("<h1>Datos del Carrito</h1>");
        for(int i=0; i<cookies.length; i++)
        {
            Cookie cookieActual = cookies[i];
            String identificador = cookieActual.getName();
            int cantidad =cookieActual.getValue().length();
            if(cantidad<=2)
            {
                 int numero =Integer.parseInt(cookieActual.getValue());
                 if(numero!=0)
                {    
                     MySQLBD baseDatos;
                    try {
                         baseDatos = new MySQLBD().conectar();
                         ResultSet resultados = baseDatos.consultar("SELECT * FROM producto WHERE `idProducto`="+identificador+"");
                   
                     if (resultados != null) {
                    
                         resultados.next();
                    //System.out.println("" + resultados.getString("nombre") + "       " + resultados.getInt("id"));

                        pw.println("<div>");
                        pw.println("<h1>"+"Nombre: "+resultados.getString("nombre")  +"</h1>");
                        pw.println("<h1>"+"Nombre: "+resultados.getInt("precio")  +"</h1>");
                        pw.println("<h1>"+ "Cantidad de productos: </h1>");
                        pw.println("<form action='AddCookies' method='Post'>");
                        pw.println("<input type='hidden' name='codigo' value='"+identificador+"'/>");
                        pw.println("<input type='number' name='cantidad' value='"+Integer.parseInt(cookieActual.getValue())+"'/>");
                        pw.println("<input type='submit' name='Anadir' value='Modificar cantidad'>");
                        pw.println("</form>");
                        precioTotal=resultados.getInt("precio")*Integer.parseInt(cookieActual.getValue())+precioTotal;
                        pw.println("</div>");
                        pw.println("<div>");
                        pw.println("<form action='AddCookies' method='Post'>");
                        pw.println("<input type='hidden' name='codigo' value='"+identificador+"'/>");
                        pw.println("<input type='hidden' name='cantidad' value='0'/>");
                        pw.println("<input type='submit' name='Agregar' value='Eliminar del Carro'>");
                        pw.println("</form>");
                        pw.println("</div>");
                        pw.println("<br>");
                     }
                     } catch (SQLException ex) {
                         Logger.getLogger(VerCookies.class.getName()).log(Level.SEVERE, null, ex);
                     }
                     
                }
            }
        }
        String btnCompra=request.getParameter("compra");
        if(btnCompra!=null){
             MySQLBD baseDatos;
            try {
                baseDatos = new MySQLBD().conectar();
                ResultSet resultados = baseDatos.consultar("SELECT * FROM forma_de_pago");
            pw.println("<form action='Pagar' method='Post'>");
            pw.println("<select name='formaPago'>");
            while (resultados.next()) {
            pw.println("<option value='"+resultados.getInt("codigo")+"'>"+resultados.getString("descripcion")+"</option>");
            }
            pw.println("</select>");
            pw.println("Rut: <input type='text' name='rut' maxlength='15'>");
            pw.println("<input type='submit' name='pagar' value='Pagar'>");
             pw.println("</form>");
            btnCompra=null;
             } catch (SQLException ex) {
                         Logger.getLogger(VerCookies.class.getName()).log(Level.SEVERE, null, ex);
                     }
        }else{
           if(precioTotal==0){
           pw.println("<h1>No hay Item en carrito</h1>");
           }else{
            HttpSession sesion = (HttpSession)request.getSession();
          if(sesion.getAttribute("Usuario") == null){
              pw.println("<a href=\"login.jsp\">Login para comprar</a>");
          }else{
                pw.println("<form action='VerCookies' method='Get'>");
                pw.println("<input type='hidden' name='codigo' value='"+precioTotal+"'/>");
                pw.println("<h2>Precio Total es: "+precioTotal+"</h2>");
                pw.println("<input type='submit' name='compra' value='Comprar'>");
                pw.println("</form>");
                pw.println("<form action=\"Logout\"><input type=submit value=\"Cerrar sesión\"/></form><br><br>");
          
          }
                
            }
        }
         pw.println("</div>");
      pw.println("</div>");
      
        pw.println("</body>");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
