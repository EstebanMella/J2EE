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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sahian
 */
@WebServlet(name = "Secion", urlPatterns = {"/Secion"})
public class Secion extends HttpServlet {
   
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
            out.println("<title>Servlet Secion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Secion at " + request.getContextPath() + "</h1>");
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
       try (PrintWriter pw = response.getWriter()) {
        MySQLBD baseDatos = new MySQLBD().conectar();
        String cuenta =request.getParameter("cuenta").trim();
        String passwordLog=request.getParameter("passwd").trim();
        ResultSet resultados = baseDatos.consultar("SELECT `idCuenta` , `password` FROM `cuenta` WHERE `idCuenta` LIKE '"+cuenta+"' AND `password` LIKE '"+passwordLog+"' ");
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
                                pw.println("<li><a href="+"registro.jsp"+">Registarse</a></li>");
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
        if (resultados.first()==true)
        {
            HttpSession misession= request.getSession(true);
            misession.setAttribute("Usuario",passwordLog);
            pw.println("<h1>Ingresado</h1>");
            pw.println("<h1><a href=\"index.jsp\">Inicio</a></h1>");
            
          
            
        }else
            {
                pw.println("<h1>Usuario No Valido</h1>");
                pw.println("<a href=\"login.jsp\">Intertarlo denuevo</a>");
            }
        pw.println("</div>");
        pw.println("</div>");
        pw.println("</body>");
       } catch (SQLException ex) {
            Logger.getLogger(Secion.class.getName()).log(Level.SEVERE, null, ex);
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
