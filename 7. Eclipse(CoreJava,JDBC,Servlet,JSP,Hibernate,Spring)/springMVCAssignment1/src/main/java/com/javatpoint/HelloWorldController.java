package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

  
@Controller  
public class HelloWorldController {  
      
    @RequestMapping("/hello")  
    public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res) throws IOException 
    {  
    	PrintWriter out=res.getWriter();
    	res.setContentType("text/html");
    	String a =request.getParameter("t1");
    	String b =request.getParameter("t2");
    	String c =request.getParameter("t3");
    	String d= request.getParameter("t4");
    	String e= request.getParameter("t5");
    	String f= request.getParameter("t6");
    	String bt=request.getParameter("button");
    	if(bt.equals("Insert")) {
    		try 
        	{ 
        		Class.forName("oracle.jdbc.driver.OracleDriver");
        		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","1234");
        		PreparedStatement st=con.prepareStatement("insert into  employee values(?,?,?,?,?,?)");
        		
        		st.setString(1,a);
        		st.setString(2,b);
        		st.setString(3,c);
        		st.setString(4,d);
        		st.setString(5,e);
        		st.setString(6,f);
        		
        		st.execute();
        	 
             
            
        }catch(Exception ex) 
        	{
        	ex.printStackTrace();
        }
    		String message = "submitted "+a;  
            return new ModelAndView("hellopage", "message",message);
    		
    	}
    	if(bt.equals("Delete")) {
    		try 
        	{ 
    			Class.forName("oracle.jdbc.driver.OracleDriver");
        		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","1234");
        		PreparedStatement st=con.prepareStatement("delete from  employee where employee_no =?");
        	    int p=Integer.parseInt(a);
        	    st.setInt(1, p);
        	    st.execute();
        	    out.println("row deleted");
        	 
             
            
        }catch(Exception ex) 
        	{
        	ex.printStackTrace();
        }
    		String message = "deleted "+a;  
            return new ModelAndView("hellopage", "message",message);
    		
    	}
    	else if(bt.equals("Update"))
    	{
    	try
    	{
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","1234");
    	    PreparedStatement ps=con.prepareStatement("update employee set EMPLOYEE_NAME=?,DESIGNATION=?,SALARY=?,ADDRESS=?,PHONE=? where EMPLOYEE_NO=?");
    	    int id = Integer.parseInt(a);

    		ps.setString(1,b);
    		ps.setString(2, c);
    		ps.setString(3, d);
    		ps.setString(4,e);
    		//ps.setDate(5, date1);
    		ps.setString(5, f);
    		ps.setInt(6,id);  
    	    ps.execute();
    	    out.println("row updated");
    	    out.println("want to view data");
    	   // pw.println("<input type = submit value= view name= "">")
    	}
    	catch(Exception ae)
    	{
    		ae.printStackTrace();
    	}
    	}
    	if(bt.equals("Select"))
    	{
    	try
    	{
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","1234");
    	    PreparedStatement stmt2=con.prepareStatement("select * from employee");
    	   out.println("<table border=2");
    	    out.println("<tr>");
    		out.println("<th>EMPLOYEE NO</th><th>NAME</th><th>DESIGNATION</th><th>SALARY</th><th>ADDRESS</th><th>PHONE NUMBER</th>");
    		out.println("</tr>");
    	ResultSet rs=stmt2.executeQuery();  
    	while(rs.next()){
    	out.println("<tr>");	
    	out.println("<td>");
    	out.println(rs.getInt(1));
    	out.println("<td>");
    	out.println(rs.getString(2));
    	out.println("<td>");
    	out.println(rs.getString(3));
    	out.println("<td>");
    	out.println(rs.getString(4));
    	out.println("<td>");
    	out.println(rs.getString(5));
    	out.println("<td>");
    	out.println(rs.getString(6));
    	out.println("</tr>");

    	}  
    	}
    	catch (Exception ee) {
    	System.out.println(ee);
    	}
    	}
    	if(bt.equals("SelectId"))
    	{
    	try
    	{
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","1234");
    	    PreparedStatement stmt2=con.prepareStatement("select * from employee where employee_no =? ");
    	    int id=Integer.parseInt(a);
    	    stmt2.setInt(1,id);
    	   out.println("<table border=2");
    	    out.println("<tr>");
    		out.println("<th>EMPLOYEE NO</th><th>NAME</th><th>DESIGNATION</th><th>SALARY</th><th>ADDRESS</th><th>PHONE NUMBER</th>");
    		out.println("</tr>");
    	ResultSet rs=stmt2.executeQuery();  
    	while(rs.next()){
    	out.println("<tr>");	
    	out.println("<td>");
    	out.println(rs.getInt(1));
    	out.println("<td>");
    	out.println(rs.getString(2));
    	out.println("<td>");
    	out.println(rs.getString(3));
    	out.println("<td>");
    	out.println(rs.getString(4));
    	out.println("<td>");
    	out.println(rs.getString(5));
    	out.println("<td>");
    	out.println(rs.getString(6));
    	out.println("</tr>");

    	}  
    	}
    	catch (Exception ee) {
    	System.out.println(ee);
    	}
    	}
		return null;

    
    	  
        
}
}