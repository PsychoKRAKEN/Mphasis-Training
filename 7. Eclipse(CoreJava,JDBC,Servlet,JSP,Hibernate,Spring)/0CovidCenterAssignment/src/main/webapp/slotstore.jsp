<%
String a=request.getParameter("t1");
String b=request.getParameter("t2");
String c=request.getParameter("t3");
String d=request.getParameter("t4");
String e=request.getParameter("t5");
String f=request.getParameter("t6");


%>

<jsp:forward page="/result.jsp">
<jsp:param name="a"  value="<%=a%>" />
<jsp:param name="b"  value="<%=b%>" />
<jsp:param name="c"  value="<%=c%>" />
<jsp:param name="d"  value="<%=d%>" />
<jsp:param name="e"  value="<%=e%>" />
<jsp:param name="f"  value="<%=f%>" />
</jsp:forward>