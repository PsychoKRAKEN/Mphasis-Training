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

    	try 
    	{ 
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","1234");
    		PreparedStatement st=con.prepareStatement("insert into  employee values(?,?,?)");
    		
    		st.setLong(1,Long.parseLong(a));
    		st.setString(2,b);
    		st.setLong(3,Long.parseLong(c));
    		st.execute();
    	 
         
        
    }catch(Exception e) 
    	{
    	e.printStackTrace();
    }
    	String message = "submitted "+a;  
        return new ModelAndView("hellopage", "message",message);  
        
}
}