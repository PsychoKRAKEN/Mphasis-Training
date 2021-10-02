import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/firsthttp")
public class firsthttp extends HttpServlet  {
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String a=req.getParameter("t1");
		String b=req.getParameter("t2");
		
		if(a.equals("mphasis") && b.equals("mphasis"))
		{
			res.sendRedirect("success.html");
		}
		else
		{
			res.sendRedirect("failure.html");
		}
		
	}
}
	