package demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShowData extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // กำหนด Content type
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("Hey all!");
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Greeting Basic</h1>");
        out.println("It's nice to meet you.");
        out.println("<br>What do you do for a living ?<br>");
        out.println("Hello "+request.getParameter("fullname"));
        out.println("</body>");
        out.println("</html>");
   
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    
    
    
}
