import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/passenger")
public class passenger extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String a=req.getParameter("t1");
		String b=req.getParameter("t2");
		String c=req.getParameter("t3");
		String d=req.getParameter("t4");
		String e=req.getParameter("t5");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
			
			PreparedStatement st=con.prepareStatement("insert into passenger values(?,?,?,?,?)");
			
		    st.setInt(1,Integer.parseInt(a));
		    st.setString(2, b);
		    st.setString(4, d);
		    st.setString(3, c);
		    st.setLong(5,Long.parseLong(e));
		    
		    st.execute();
		    
		    pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Passenger Details Saved');");
			pw.println("location='homepage.html';");
			pw.println("</script>");
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
	}
}
