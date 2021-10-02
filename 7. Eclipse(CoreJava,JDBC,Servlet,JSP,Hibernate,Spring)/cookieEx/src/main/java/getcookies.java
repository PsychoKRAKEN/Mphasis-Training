import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/getcookies")
public class getcookies extends HttpServlet 
{
    public void service(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException
 {
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
         try {   
            out.println("<html>"); 
             out.println("<head>");
            out.println("<title>Servlet getcookies</title>");            
            out.println("</head>");
            out.println("<body bgcolor='blue'>");
            Cookie cookies[]=request.getCookies();
            for(int i=0;i<cookies.length;i++)
            {
                String name=cookies[i].getName();
                String value=cookies[i].getValue();
                out.println("<br> cookie name="+name+"<br>");
                out.println("<br> cookie value="+value+"<br>");
            }
            out.println("</body>");
           out.println("</html>");
                  } finally {               
               out.close();       }     }}