<%
int a=Integer.parseInt(request.getParameter("t1"));
int b=Integer.parseInt(request.getParameter("t2"));
String button=request.getParameter("button");
int result=0;

%>

<%
if(button.equals("+"))
{
	try
	{
		result=a+b;
	}
	catch(Exception E)
	{
		E.printStackTrace();
	}
}
else if(button.equals("-"))
{
	try
	{
		result=a-b;
	}
	catch(Exception E)
	{
		E.printStackTrace();
	}
}
else if(button.equals("*"))
{
	try
	{
		result=a*b;
	}
	catch(Exception E)
	{
		E.printStackTrace();
	}
}
if(button.equals("/"))
{
	try
	{
		result=a/b;
	}
	catch(Exception E)
	{
		E.printStackTrace();
	}
}

%>

<jsp:forward page="/result.jsp">
<jsp:param name="result"  value="<%=result%>" />
</jsp:forward>