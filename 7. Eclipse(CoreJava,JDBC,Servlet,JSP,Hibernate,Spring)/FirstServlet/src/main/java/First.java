import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/First")
public class First extends GenericServlet  {
	
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
		String button=req.getParameter("button");
		pw.println("<h1>The Registered data is </h1>");
		pw.println("The Employee Number is "+a);
		pw.println("<br>");
		pw.println("The Employee Name is "+b);
		pw.println("<br>");
		pw.println("The Employee Address is "+c);
		pw.println("<br>");
		pw.println("The Employee Phone No. is "+d);
		pw.println("<br>");
		pw.println("The Employee Salary is "+e);
		pw.println("<br>");
		pw.println("Button Pressed is "+button);
		pw.println("<br>");
		
		Connection con=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		} catch (Exception e1) {
				e1.printStackTrace();
		}
		
		if(button.equals("Insert"))
		{
			try
			{
			    PreparedStatement st=con.prepareStatement("insert into mp192 values(?,?,?,?,?)");
			    
			    st.setInt(1,Integer.parseInt(a));
			    st.setString(2, b);
			    st.setString(3, c);
			    st.setLong(4,Long.parseLong(d));
			    st.setInt(5,Integer.parseInt(e));
			    
			    st.execute();
			    pw.println("<b>Row Inserted</b>");
			}
			catch(Exception E)
			{
				E.printStackTrace();
			}
		}
		
		else if(button.equals("Update"))
		{
			try
			{
			    PreparedStatement st=con.prepareStatement("update mp192 set name=?,address=?,phoneno=?,salary=? where empno=?");
			    st.setInt(5,Integer.parseInt(a));
			    st.setString(1, b);
			    st.setString(2, c);
			    st.setLong(3,Long.parseLong(d));
			    st.setInt(4,Integer.parseInt(e));
			    
			    st.execute();
			    pw.println("<b>Row Updated</b>");
			}
			catch(Exception ae)
			{
				ae.printStackTrace();
			}
		}
		
		else if(button.equals("Delete"))
		{
			try
			{
				PreparedStatement st=con.prepareStatement("delete from  mp192 where empno=?");
				st.setInt(1,Integer.parseInt(a));
			    
			    
			    st.execute();
			    pw.println("<b>Row Deleted</b>");
			}
			catch(Exception ae)
			{
				ae.printStackTrace();
			}
		}
		
		else if(button.equals("Select"))
		{
			try
			{
			    PreparedStatement st=con.prepareStatement("select * from mp192");
			    pw.println("<h3><center>Employee Registration Report</h3><hr>");
			   	pw.println("<table border=2>");
			    pw.println("<tr>");
			   	 pw.println("<th>EMPNO</th><th>NAME</th><th>ADDRESS</th><th>PHONENO</th><th>SALARY</th>");
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
			    	pw.println("</tr>");
			    }
			}
			catch(Exception ae)
			{
				ae.printStackTrace();
			}
		}
		else
		{
			System.out.println("Wrong Choice");
		}
		
		
	}
}
