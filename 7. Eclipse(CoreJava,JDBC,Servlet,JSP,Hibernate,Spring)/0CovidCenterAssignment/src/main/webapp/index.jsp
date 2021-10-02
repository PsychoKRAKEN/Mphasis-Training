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
</head>
<body>

<nav class="navbar navbar-default">

  <div class="container-fluid">
  
    <div class="navbar-header">
	
      <a class="navbar-brand" href="#">HelpDesk For Covid19</a>
	  </div>
    
    <ul class="nav navbar-nav">
	
      <li class="active"><a href="index.jsp">Home</a></li>
    <li ><a href="register.jsp">Registration</a></li>
    <li ><a href="login.jsp">Login</a></li>
	
	
	
	<img src="logo.jpg" alt="Home" allign="right" height="70px" width="50px" title="Home">
	
	
    </ul>
  </div>
  
</nav>
  
<img src="1.png" width="100%"   />

 <p><marquee width="100%" behaviour="alternate" bgcolor="Crimson" scrollamount="10"><font speed="10"color="white" size="5"><b>
  Clean your hands often. Use soap and water, or an alcohol-based hand rub.</b></font></marquee></p>
  


<script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>

<style>
/**
 * Default image styling
 */
img {
  max-width: 100%;
  height: auto;
  vertical-align: bottom;
}

/**
 * Image styling 
 */
img.panopoly-image-full {
  max-width: 100%;
  width: 100% !important;
  height: auto;
  margin-bottom: .5em;
}

img.panopoly-image-half {
  max-width: 50%;
  width: 50%;
  height: auto;
  float: left;
  margin-right: .75em;
  margin-bottom: .5em;
  margin-top: .5em;
}

img.panopoly-image-quarter {
  max-width: 25%;
  width: 25%;
  height: auto;
  float: left;
  margin-right: .5em;
  margin-bottom: .25em;
  margin-top: .25em;
}

img.panopoly-image-featured {
  max-width: 100%;
  height: auto;
}

img.panopoly-image-thumbnail {
  max-width: 100%;
  height: auto;
}

img.panopoly-image-square {
  max-width: 100%;
  height: auto;
}

body{
background-image:url("covid1.jpg");
background-repeat:no-repeat;
background-attachment: fixed;
background-size:100% 100%;
}
input:focus
{
background-color:yellow;
}

.custom{
color:red;
font-size:20px;
}

#covin
{
    height: 200px;
    width: 100%;
    background-color: white;
	font-size:30px;
	font-family:Times New Roman;
	color:#002060;
	font-family: Roboto,sans-serif!important;
	padding-left:30px
}
#vaccine
{
    height: 200px;
    width: 100%;
    background-color: yellow;
	font-size:20px;
	font-family: Roboto,sans-serif!important;
	padding-left:30px
	
}
#sympton
{
 border: 1px solid black; 
    height:30px;
	width:100%;
    background-color: white;
	font-size:20px;
	font-family: Roboto,sans-serif!important;
	padding-left:550px
}
.p
{
border: 2px solid powderblue;
padding: 30px;
 }
 p
 {
 font-size:12px;
 }
 button{
 border-radius: "25%/50%";
 }
 .center {
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 50%;
}
form-control{
left-padding:80px;
right-padding:80px
}


</style>

 
<body>   
<img src="modi.png" height="180" width="180" align="right">
<div id="covin">Are You Protected<br>
 Against Covid-19<br>
<p>क्या आप कोविड-19 से सुरक्षित हैं ?</p>
</div><br>
<img src="vaccine.jpg" height="100" width="240" align="right">
<div id="vaccine">CoWIN Is Helping Countries Worldwide To Run Vaccination Drives<br><br>

Launching CoWIN as an open source platform for countries<br>
 to orchestrate successful vaccination with efficient monitoring with <br>
an aim of achieving universal vaccination<br>
<button style="background-color:red; color:black">Know More</button>
</div>
<div id="Sympton">Know your sympton</div>
<img src="contactcovid.png" height="300" width="600" class="center">
<center><h3>Check Your Nearest Vaccination Center And Slots Availability</h3></center>
<h4>Search by Pin</h4>  
  <input class="form-control" id="myInput" type="text" placeholder="Search..">
    


</body>
</html>