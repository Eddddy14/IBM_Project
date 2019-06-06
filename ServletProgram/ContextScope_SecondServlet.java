/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletProgram;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Home
 */
@WebServlet(name = "ContextScope_SecondServlet", urlPatterns = {"/ContextScope_SecondServlet"})
public class ContextScope_SecondServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ContextScope_SecondServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ContextScope_SecondServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
        ServletContext context=getServletContext();
        String s=(String)context.getAttribute("UserData");
        response.setContentType("text/html");
         PrintWriter out=response.getWriter(); 
          
       out.println("VALUE STORED "+ s);
     
        
    }

 

}
