<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<body bgcolor=pink>

<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="style.css">
</head>
<body>

<nav class="navbar navbar-default">

  <div class="container-fluid">
  
    <div class="navbar-header">
	
      <a class="navbar-brand" href="#">HelpDesk For Covid19</a>
    </div>
    <ul class="nav navbar-nav">
	
      <li><a href="index.jsp">Home</a></li>
    <li ><a href="register.jsp">Registration</a></li>
	<li class="active" ><a href="login.jsp">Login</a></li>
	
	<img src="logo.jpg" alt="Home" allign="right" height="70px" width="50px" title="Home">
	
    </ul>
  </div>
  
</nav>
  
<div class="container">

 <p><marquee width="100%" behaviour="alternate" bgcolor="Crimson" scrollamount="10"><font speed="10"color="white" size="5"><b>
  Clean your hands often. Use soap and water, or an alcohol-based hand rub.</b></font></marquee></p>
  
</div>

<div id="mainid">

<div class="wrapper">

      <div class="title">Login</div>
      <form action="login.html" method="post">
      <div id="emailHelp" class="form-text">Your FirstName is Username</div>
        <div class="field">
          <input type="text" name="x1" required>
          <label>Username</label>
        </div>
        <div class="field">
          <input type="password" name="x2" required>
          <label>Password</label>
        </div>
       <br>
          
        <div class="field" >
          <input type="submit" value="Login">
        </div>
        <div class="signup-link">Not registered? <a href="register.jsp">Signup now</a></div>
        
      </form>
    </div>
    </div>



</body>
</html>





