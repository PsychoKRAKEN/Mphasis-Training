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
	
      <li ><a href="homepage.jsp">Home</a></li>
      <li ><a href="slotbook.jsp">Slot Book</a></li>
	<li ><a href="Doctor.jsp">Available Doctor</a></li>
	<li class="active"><a href="bedregister.jsp">Available Bed</a></li>
	<li ><a href="ambulance.jsp">Ambulance</a></li>
	
	
    <li><a href="contactus.jsp">Contact US</a></li>
    <li><a href="feedback.jsp">FeedBack</a></li>
    <li><a href="index.jsp">LogOut</a></li>
	<img src="logo.jpg" alt="Home" allign="right" height="70px" width="50px" title="Home">
	
    </ul>
  </div>
  
</nav>
  
<div class="container">

 <p><marquee width="100%" behaviour="alternate" bgcolor="Crimson" scrollamount="10"><font speed="10"color="white" size="5"><b>
  Clean your hands often. Use soap and water, or an alcohol-based hand rub.</b></font></marquee></p>
  
</div>



<h1><center><font color=black><b>Register For Bed</b></center></h1><br>
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
background-image:url("3.jpg");
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
h1{
color:Black;
font-size:20px;
}
</style>

 
<body>   
 
        
<form onsubmit="second">


<h1><b>Hospital name</b></h1>
<input type="text" list="Hospitallist" name=t1>
<datalist id="Hospitallist">
<option value="City Hospital">
<option value="Global Hospital">
<option value="Apollo Hospital">
<option value="Jeevan Jyoti Hospital">
<option value="Leelavati Hospital and Medical Research">
<option value="Liberty Hospital">
<option value="IGMS">
<option value="AIIMS">
</datalist>
<h1><b>City</b></h1>
<select name=t2>
<option value="Bangalore">Bangalore</option>
<option value="Patna">Patna</option>
<option value="Chennai">Chennai</option>
<option value="Hyderabad">Hyderabad</option>
<option value="Jaipur">Jaipur</option>
<option value="Pune">Kolkata</option>
<option value="Pune">Ahmedabad</option>
<option value="Pune">Surat</option>
<option value="Pune">Bhopal</option>
<option value="Pune">Lucknow</option>
<option value="Pune">Indore</option>
</select>
<input type=submit value=Search><input type=reset>
</form><br><br>
<center><img src="bed.jpg" alt="sorry image not available" height="400" width="1400" align="left" /></center><br>
</body>
</html>    

