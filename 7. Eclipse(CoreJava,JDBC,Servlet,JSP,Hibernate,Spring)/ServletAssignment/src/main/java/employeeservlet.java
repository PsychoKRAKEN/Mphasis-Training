import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/employeeservlet")
public class employeeservlet extends GenericServlet {
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
		String f=req.getParameter("t6");
		String g=req.getParameter("t7");
		String button=req.getParameter("button");
		
		/*
		pw.println("<h1>The Registered data is </h1>");
		pw.println("The Employee ID is "+a);
		pw.println("<br>");
		pw.println("The Employee Name is "+b);
		pw.println("<br>");
		pw.println("The Employee Address is "+c);
		pw.println("<br>");
		pw.println("The Employee Dept is "+d);
		pw.println("<br>");
		pw.println("The Employee Salary is "+e);
		pw.println("<br>");
		pw.println("The Employee OtherBenefits is "+e);
		pw.println("<br>");
		pw.println("The Employee Gross is "+e);
		pw.println("<br>");
		*/
		
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
			    PreparedStatement st=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
			    
			    st.setLong(1,Long.parseLong(a));
			    st.setString(2, b);
			    st.setString(3, c);
			    st.setString(4, d);
			    st.setLong(5,Long.parseLong(e));
			    st.setLong(6,Long.parseLong(f));
			    st.setLong(7,Long.parseLong(g));
			    
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
			    PreparedStatement st=con.prepareStatement("update employee set name=?,address=?,dept=?,salary=?,otherbenefits=?,gross=? where empid=?");
			    st.setLong(7,Long.parseLong(a));
			    st.setString(1, b);
			    st.setString(2, c);
			    st.setString(3, d);
			    st.setLong(4,Long.parseLong(e));
			    st.setLong(5,Long.parseLong(f));
			    st.setLong(6,Long.parseLong(g));
			    
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
				PreparedStatement st=con.prepareStatement("delete from  employee where empid=?");
				 st.setLong(1,Long.parseLong(a));
			    
			    
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
			    PreparedStatement st=con.prepareStatement("select * from employee");
			    pw.println("<h3><center>Employee Registration Report</h3><hr>");
			   	pw.println("<table border=2>");
			    pw.println("<tr>");
			   	 pw.println("<th>EMPID</th><th>NAME</th><th>ADDRESS</th><th>DEPT</th><th>SALARY</th><th>OTHERBENEFITS</th><th>GROSS</th>");
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
