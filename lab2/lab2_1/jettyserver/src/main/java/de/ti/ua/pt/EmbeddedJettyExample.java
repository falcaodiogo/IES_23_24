package de.ti.ua.pt;
 
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class EmbeddedJettyExample {
 
    public static void main(String[] args) throws Exception {
         
        Server server = new Server(8680);       
         
        ServletHandler servletHandler = new ServletHandler();
        server.setHandler(servletHandler);
                 
        servletHandler.addServletWithMapping(HelloServlet.class, "/");
         
        server.start();
        server.join();
 
    }
     
    public static class HelloServlet extends HttpServlet 
    {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            String msg = request.getParameter("msg");

            response.setContentType("text/html");
            response.setStatus(HttpServletResponse.SC_OK);
            response.getWriter().println("<h1>Exemplo de teste IES 2023</h1>"); 
            response.getWriter().println("<h2>Jetty server from the exercise 2.1 a)</h2>"); 
            response.getWriter().println("<h2></h2>");
            response.getWriter().println("<h2>108712</h2>");  

            if (msg!=null) {
                response.getWriter().println("<h2>Hard workers welcome!</h2>");  
            }
        } 
               
    }
 }