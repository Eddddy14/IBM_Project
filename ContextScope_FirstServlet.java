
package ServletProgram;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.core.ApplicationContext;

@WebServlet(name = "ContextScope_FirstServlet", urlPatterns = {"/ContextScope_FirstServlet"})
public class ContextScope_FirstServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String s="HELLO";
        ServletContext context=getServletContext();
        context.setAttribute("UserData",s );
          response.setContentType("text/html");
        PrintWriter out=response.getWriter(); 
          
          
          out.println("VALUE STORED");
          
          out.close();
       
    }

   

}
