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
      
    @RequestMapping("/register")  
    public void helloWorld(HttpServletRequest request,HttpServletResponse res) throws IOException 
    {  
    	PrintWriter pw=res.getWriter();
    	res.setContentType("text/html");
    	String a =request.getParameter("t1");
    	String b =request.getParameter("t2");
    	String c =request.getParameter("t3");
    	String d =request.getParameter("t4");
    	String e =request.getParameter("t5");

    	try 
    	{ 
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","1234");
    		PreparedStatement st=con.prepareStatement("insert into  covidcare values(?,?,?,?,?)");
    		
    		st.setString(1,a);
    		st.setString(2,b);
    		st.setLong(3,Long.parseLong(c));
    		st.setString(4,d);
    		st.setString(5,e);
    		st.execute();
    	 
         
        
    }catch(Exception E) 
    	{
    	E.printStackTrace();
    }
       res.sendRedirect("login.jsp");  
        
}
    
    
    @RequestMapping("/login")  
    public void hello(HttpServletRequest request,HttpServletResponse res) throws IOException 
    {  
    	PrintWriter pw=res.getWriter();
    	res.setContentType("text/html");
    	String a =request.getParameter("x1");
    	String b =request.getParameter("x2");
    	boolean x=false;

    	try 
    	{ 
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","1234");
    		PreparedStatement st=con.prepareStatement("select * from covidcare where fname=? AND password=?");
    		
    		st.setString(1,a);
    		st.setString(2,b);
    		
    		
    		if(st.execute())
    		{
    			if(st.getResultSet().next())
    			{
    				res.sendRedirect("homepage.jsp");
    			}
    			else
    			{
    				pw.println("<script type=\"text/javascript\">");
    				pw.println("alert('Username or Password incorrect');");
    				pw.println("location='login.jsp';");
    				pw.println("</script>");
    			}
    			
    		}
    		else
    		{
    			pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Username or Password incorrect');");
				pw.println("location='login.jsp';");
				pw.println("</script>");
    		}
         
        
    }catch(Exception E) 
    	{
    	E.printStackTrace();
    	pw.println("<script type=\"text/javascript\">");
		pw.println("alert('Username or Password incorrect');");
		pw.println("location='login.jsp';");
		pw.println("</script>");
    	
    }
    	
    	
}
    
}