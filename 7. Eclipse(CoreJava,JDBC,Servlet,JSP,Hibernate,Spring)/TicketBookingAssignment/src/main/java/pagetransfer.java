import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/pagetransfer")
public class pagetransfer extends HttpServlet  {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String button=req.getParameter("button");
		
		Connection con=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		} catch (Exception e1) {
				e1.printStackTrace();
		}
		
		if(button.equals("Flight Details"))
		{
			try
			{
				res.sendRedirect("flightdetails.html");
			}
			catch(Exception E)
			{
				E.printStackTrace();
			}
		}
		
		if(button.equals("Flight Booking"))
		{
			try
			{
				res.sendRedirect("flightbooking.html");
			}
			catch(Exception E)
			{
				E.printStackTrace();
			}
		}
		
		if(button.equals("Passenger Details"))
		{
			try
			{
				res.sendRedirect("passengerdetails.html");
			}
			catch(Exception E)
			{
				E.printStackTrace();
			}
		}
		
		if(button.equals("Checkin Details"))
		{
			try
			{
				res.sendRedirect("checkindetails.html");
			}
			catch(Exception E)
			{
				E.printStackTrace();
			}
		}
		
		
		
	}
}
	