 
<% out.println("<h1><font color='red'>welcome to jsp page");%>
 <%
        int a=100,b=20,sum;
        sum=a+b;
        out.println("sum of two number is"+sum);
        %>
<h1>declaration Tag</h1>
        <%!int sum,a,b=20;%>         <!-- global declaration -->
        
<%
        a=10;
        sum=a+b;
        out.println("sum of number is"+sum+"<br>");
 %>

 
 <body>
        <h1>Hello World!</h1>
<!-- expression tag  -->
        <%= 5+4 %>
<!-- declarative -->
        <%!int s,c,d;%>  <!-- this is known as global declaration -->
        <% c=10;d=20; s=a+b;
        out.println("the sum of numbers is"+s);
        %>
        <font color="red" size="8">
            the sum of <%=c%> and <%=d%> is <%=s%>
        </font>                  
    </body>