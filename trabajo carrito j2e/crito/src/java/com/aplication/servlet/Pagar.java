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

/**
 *
 * @author sahian
 */
@WebServlet(name = "Pagar", urlPatterns = {"/Pagar"})
public class Pagar extends HttpServlet {

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
            out.println("<title>Servlet Pagar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Pagar at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
         Cookie [] cookies = request.getCookies();
         int precioTotal=0;

        PrintWriter pw= response.getWriter();
            pw.println("<!DOCTYPE html>");
            pw.println("<html>");
            pw.println("<head>");
            pw.println("<title>Twilight Heavy Set</title>");
            pw.println("<link rel="+"stylesheet"+" type="+"text/css"+" href="+"css/style.css"+">");
            pw.println("</head>");

            pw.println("<body link="+"#ffffcc"+" vlink="+"#ffffcc"+" alink="+"#ffffcc"+">");
            pw.println("<div id="+"cabecera"+">");
            pw.println("<div id="+"logo"+"></div>");

		pw.println("<div id="+"menu"+">");
			pw.println("<ul>");
			pw.println("<ul class="+"claseLista"+">");
				pw.println("<li><a href="+"login.jsp"+">Login</a></li>");
                                pw.println("<li><a href="+"registro.jsp"+">Registarce</a></li>");
				pw.println("<li><a href="+"index.jsp"+">Home</a></li>");
			pw.println("</ul>");
		pw.println("</div>");

	pw.println("</div>");


	pw.println("<div id="+"latiz"+">");
		pw.println("<ul class="+"listaIz"+">");
			pw.println("<li>Item I</li>");
			pw.println("<li>Item II</li>");
			pw.println("<li>Item III</li>");
			pw.println("<li>Item IV</li>");
		pw.println("</ul>");
	pw.println("</div>");
         pw.println("<div id="+"central"+">");
         pw.println("<div id="+"desImg"+">");
            pw.println("<title>Carrito</title>");
             pw.println("<h1>Datos del Carrito</h1>");
        
            String rut =request.getParameter("rut");
            String formaPago =request.getParameter("formaPago");
             MySQLBD baseDatos;
             try {
                 baseDatos = new MySQLBD().conectar();
                 ResultSet resultados2 = baseDatos.consultar("SELECT * FROM cliente WHERE `rut`="+rut+"");
                 resultados2.next();
          for(int i=0; i<cookies.length; i++)
            {
            Cookie cookieActual = cookies[i];
            String identificador = cookieActual.getName();
            int cantidad =cookieActual.getValue().length();  
           if(rut.compareToIgnoreCase(resultados2.getString("rut").trim())!=0)
             {
                 pw.println("<h1>Rut Mal Ingresado</h1>");
                             
             }else{
               baseDatos = new MySQLBD().conectar();
               boolean insertar=baseDatos.ejecutar("INSERT INTO `venta`(`num_venta`, `cliente_rut`) VALUES ('null',"+rut+"')");
               ResultSet ultimaVenta = baseDatos.consultar("SELECT * FROM producto ORDER By `num_venta` ");
               ultimaVenta.last();
               int num_venta=ultimaVenta.getInt("num_venta");
            if(cantidad<=2)
            {
                 int numero =Integer.parseInt(cookieActual.getValue());
                 if(numero!=0)
                {    
                      
                    try {
                         baseDatos = new MySQLBD().conectar();
                         ResultSet resultados = baseDatos.consultar("SELECT * FROM producto WHERE `idProducto`="+identificador+"");
                         
                        
                        
                       
                     if (resultados != null) {
                    
                         resultados.next();
                        insertar=baseDatos.ejecutar("INSERT INTO `detalle_venta`(`cantidad`, `precio_unitario`, `num_cuota`, `producto_idproducto`, `venta_num_venta`, `forma_de_pago_codigo`) VALUES ('"+numero+"','"+resultados.getInt("precio")+"','1','"+Integer.parseInt(identificador)+"','"+num_venta+"','"+formaPago+"')");

                       
                     }
                     } catch (SQLException ex) {
                         Logger.getLogger(VerCookies.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 
                     
                }
            }
        }    }} catch (SQLException ex) {
                 Logger.getLogger(Pagar.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        pw.println("<h1>Venta Realizada con exito</h1>");
            pw.println("</div>");
      pw.println("</div>");
        pw.println("</body>");
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
