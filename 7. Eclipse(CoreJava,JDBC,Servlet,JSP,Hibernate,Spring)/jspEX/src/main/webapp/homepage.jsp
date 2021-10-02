<%@page import="java.sql.*" %>
<h1>Employee Details </h1>
<%
String a=request.getParameter("t1");
String b=request.getParameter("t2");
String c=request.getParameter("t3");
String d=request.getParameter("t4");
String e=request.getParameter("t5");
String button=request.getParameter("button");
%>
<%
out.println("The Employee Number is "+a);
out.println("<br>");
out.println("The Employee Name is "+b);
out.println("<br>");
out.println("The Employee Address is "+c);
out.println("<br>");
out.println("The Employee Phone No. is "+d);
out.println("<br>");
out.println("The Employee Salary is "+e);
out.println("<br>");
out.println("Button Pressed is "+button);
out.println("<br>");
%>


<%
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
	    out.println("<b>Row Inserted</b>");
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
	    out.println("<b>Row Updated</b>");
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
	    out.println("<b>Row Deleted</b>");
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
	    out.println("<h3><center>Employee Registration Report</h3><hr>");
	   	out.println("<table border=2>");
	    out.println("<tr>");
	   	out.println("<th>EMPNO</th><th>NAME</th><th>ADDRESS</th><th>PHONENO</th><th>SALARY</th>");
	   	out.println("</tr>");
	    ResultSet rs=st.executeQuery();
	    while(rs.next())
	    {
	    	out.println("<tr><td>");
	    	out.println(rs.getString(1));
	    	out.println("<td>");
	    	out.println(rs.getString(2));
	    	out.println("<td>");
	    	out.println(rs.getString(3));
	    	out.println("<td>");
	    	out.println(rs.getString(4));
	    	out.println("<td>");
	    	out.println(rs.getString(5));
	    	out.println("</tr>");
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

%>