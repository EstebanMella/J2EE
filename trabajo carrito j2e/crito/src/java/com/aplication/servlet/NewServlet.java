/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SantoTomas
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

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
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String btnRegistro=request.getParameter("EnviarRegistro");
           if(btnRegistro!=null){
            /* TODO output your page here. You may use following sample code. */
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
            String nombre =request.getParameter("nombre");
            String a_paterno =request.getParameter("a_paterno");
            String a_materno =request.getParameter("a_materno");
            String email =request.getParameter("email");
            String fono =request.getParameter("fono");
            String rut=request.getParameter("rut");
            String direccion=request.getParameter("direccion");
            String password=request.getParameter("passwd");
            String password2=request.getParameter("passwd2");
            String cuenta=request.getParameter("cuenta");
            int contarletras=password.length();
            
            if(password.compareTo(password2)!=0)
            {
                out.println("<h1> PassWord no coinciden</h1>");
                out.println("<br>");
                out.println("<a href=\"registro.jsp\">Crear perfil</a>");
            }else if (contarletras==0)
            {
                out.println("<h1> Llene todos los datos</h1>");
                out.println("<br>");
                out.println("<a href=\"registro.jsp\">Crear perfil</a>");
            }else
            {
                MySQLBD baseDatos = new MySQLBD().conectar();
                String values = "VALUES ('"+rut+"','"+nombre+"','"+a_paterno+"','"+a_materno+"','"+direccion+"','"+fono+"','"+email+"','"+cuenta+"')";
                boolean resultados = baseDatos.ejecutar("INSERT INTO `cliente`(`rut`, `nombre`, `a_paterno`, `a_materno`, `direccion`, `fono`, `email`, `cuenta_idCuenta`)"+values); 
                resultados=baseDatos.ejecutar("INSERT INTO `cuenta`(`idCuenta`,`password`) VALUES ('"+cuenta+"','"+password+"')");
                out.println("<h1> Registro Guardado</h1>");
                out.println("<br>");
                out.println("<a href=\"index.jsp\">Inicio</a>");
            }
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
           }
         
        } catch (SQLException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
