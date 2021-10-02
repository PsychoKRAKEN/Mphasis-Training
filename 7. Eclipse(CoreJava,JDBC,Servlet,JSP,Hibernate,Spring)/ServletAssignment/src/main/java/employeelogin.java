import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/employeelogin")
public class employeelogin extends HttpServlet  {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String a=req.getParameter("x1");
		String b=req.getParameter("x2");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
			PreparedStatement st=con.prepareStatement("select * from employee where name=? and empid=?");
			st.setString(1,a);
			st.setString(2, b);
			ResultSet rs=st.executeQuery();
			
			if(rs.next())
			{
				res.sendRedirect("registration.html");
			}
			else
			{
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('ID or password incorrect');");
				pw.println("location='Homepage.html';");
				pw.println("</script>");
	       
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
	