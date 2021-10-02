<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Result</title>
</head>
<body>


<%
String result=request.getParameter("result");
%>

<div id="mainid">
<div class="wrapper">
<form class="container-sm">
<div class="mb-3 field">
    <input type="text" class="form-control" name="t3" value=<%=result%>>
    <label for="ans" class="form-label">Answer</label>
</div>
</form>
</div>
</div>

<jsp:include page="/homepage.html"></jsp:include>

</body>
</html>