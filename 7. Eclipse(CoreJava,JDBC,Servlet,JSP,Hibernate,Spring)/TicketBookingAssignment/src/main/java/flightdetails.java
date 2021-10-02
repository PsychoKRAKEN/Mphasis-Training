import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/flightdetails")
public class flightdetails extends HttpServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String a=req.getParameter("t2");
		String b=req.getParameter("t3");
		String c=req.getParameter("t4");
		String d=req.getParameter("t5");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
			
			PreparedStatement st=con.prepareStatement("select * from flight where flight_number=? and id=? and fare_id=? and inv_id=?");
			
			st.setString(1, a);
		    st.setLong(2,Long.parseLong(b));
		    st.setLong(3,Long.parseLong(c));
		    st.setLong(4,Long.parseLong(d));
		    
		    st.execute();
			
			pw.println("<h3><center>Flight Details</h3><hr>");
		   	pw.println("<table border=2>");
		    pw.println("<tr>");
		   	 pw.println("<th>EMPID</th><th>ID</th><th>ORIGIN</th><th>DESTINATION</th><th>FLIGHT NUMBER</th><th>FLIGHT DATE</th><th>FARE ID</th><th>INV ID</th>");
		   	 pw.println("</tr>");
		    ResultSet rs=st.executeQuery();
		    while(rs.next())
		    {
		    	pw.println("<tr><td>");
		    	pw.println(rs.getString(1));
		    	pw.println("<td>");
		    	pw.println(rs.getString(2));
		    	pw.println("<td>");
		    	pw.println(rs.getString(3));
		    	pw.println("<td>");
		    	pw.println(rs.getString(4));
		    	pw.println("<td>");
		    	pw.println(rs.getString(5));
		    	pw.println("<td>");
		    	pw.println(rs.getString(6));
		    	pw.println("<td>");
		    	pw.println(rs.getString(7));
		    	pw.println("</tr>");
		    }
		}
		catch (Exception E) {
			E.printStackTrace();
		}
	}
	
}
