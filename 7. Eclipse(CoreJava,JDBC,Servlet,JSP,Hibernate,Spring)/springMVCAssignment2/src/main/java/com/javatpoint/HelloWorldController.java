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
    		PreparedStatement st=con.prepareStatement("insert into  empregistration values(?,?,?,?,?)");
    		
    		st.setLong(1,Long.parseLong(a));
    		st.setString(2,b);
    		st.setString(3,c);
    		st.setLong(4,Long.parseLong(d));
    		st.setString(5,e);
    		st.execute();
    	 
         
        
    }catch(Exception E) 
    	{
    	E.printStackTrace();
    }
        return new ModelAndView("Login");  
        
}
    
    
    @RequestMapping("/login")  
    public ModelAndView hello(HttpServletRequest request,HttpServletResponse res) throws IOException 
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
    		PreparedStatement st=con.prepareStatement("select * from empregistration where eid=? AND password=?");
    		
    		st.setLong(1,Long.parseLong(a));
    		st.setString(2,b);
    		
    		
    		if(st.execute())
    		{
    			if(st.getResultSet().next())
    			{
    				String message = "Successfully Login with Employee ID "+a;  
                    return new ModelAndView("hellopage", "message",message);
    			}
    			else
    			{
    				String message = "Login failed";  
                    return new ModelAndView("errorpage", "message",message);
    			}
    			
    		}
    		else
    		{
    			String message = "Login failed";  
                return new ModelAndView("errorpage", "message",message);
    		}
         
        
    }catch(Exception E) 
    	{
    	E.printStackTrace();
    	String message = "Login failed";  
        return new ModelAndView("errorpage", "message",message);
    	
    }
    	
    	
}
    
}