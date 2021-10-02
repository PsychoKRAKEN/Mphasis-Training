<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<%
String a=request.getParameter("a");
String b=request.getParameter("b");
String c=request.getParameter("c");
String d=request.getParameter("d");
String e=request.getParameter("e");
String f=request.getParameter("f");
%>

<nav class="navbar navbar-default">

  <div class="container-fluid">
  
    <div class="navbar-header">
	
      <a class="navbar-brand" href="#">HelpDesk For Covid19</a>
    </div>
    <ul class="nav navbar-nav">
	
      <li><a href="homepage.jsp">Home</a></li>
      <li class="active"><a href="slotbook.jsp">Slot Book</a></li>
	<li ><a href="Doctor.jsp">Available Doctor</a></li>
	<li ><a href="bedregister.jsp">Available Bed</a></li>
	<li ><a href="ambulance.jsp">Ambulance</a></li>
	
	
    <li><a href="contactus.jsp">Contact US</a></li>
    <li ><a href="feedback.jsp">FeedBack</a></li>
    <li><a href="index.jsp">LogOut</a></li>
	<img src="logo.jpg" alt="Home" allign="right" height="70px" width="50px" title="Home">
	
    </ul>
  </div>
  
</nav>

<div id="mainid">

<div class="wrapper">

      <div class="title">Slot Booked Successfully</div>
      <form>
      <div id="emailHelp" class="form-text">Your FirstName is Username</div>
        <div class="field">
          <input type="text" name="x1" value="<%=a%>" required>
          <label>Name</label>
        </div>
        
        <div class="field">
          <input type="text" name="x1" value="<%=b%>" required>
          <label>Aadhar Card Number</label>
        </div>
        
        <div class="field">
          <input type="text" name="x1" value="<%=c%>" required>
          <label>Nearest Hospital</label>
        </div>
        
        <div class="field">
          <input type="text" name="x1" value="<%=d%>" required>
          <label>City</label>
        </div>
        
        <div class="field">
          <input type="text" name="x1" value="<%=e%>" required>
          <label>State</label>
        </div>
        
        <div class="field">
          <input type="text" name="x1" value="<%=f%>" required>
          <label>Postal Code</label>
        </div>
        
       
      </form>
    </div>
    </div>
</body>
</html>