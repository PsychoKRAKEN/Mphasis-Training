import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/addcookies")
public class addcookies extends HttpServlet
 {
     protected void service(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
           try {
            String name1=request.getParameter("n1");
            String value1=request.getParameter("n2");
            Cookie cc=new Cookie(name1, value1);
            response.addCookie(cc);
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet addcookies</title>");            
            out.println("</head>");
            out.println("<body bgcolor='blue'>");
            out.println("Name of first cookie = ");
            out.println(name1);
            out.println("<br>value of first cookie = ");
            out.println(value1);
            out.println("</body>");
            out.println("</html>");
        } finally {               
               out.close();
          }     }}