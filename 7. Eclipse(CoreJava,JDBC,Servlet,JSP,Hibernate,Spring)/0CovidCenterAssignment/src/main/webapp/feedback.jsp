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
	
      <li><a href="homepage.jsp">Home</a></li>
      <li ><a href="slotbook.jsp">Slot Book</a></li>
	<li ><a href="Doctor.jsp">Available Doctor</a></li>
	<li ><a href="bedregister.jsp">Available Bed</a></li>
	<li ><a href="ambulance.jsp">Ambulance</a></li>
	
	
    <li><a href="contactus.jsp">Contact US</a></li>
    <li class="active"><a href="feedback.jsp">FeedBack</a></li>
    <li><a href="index.jsp">LogOut</a></li>
	<img src="logo.jpg" alt="Home" allign="right" height="70px" width="50px" title="Home">
	
    </ul>
  </div>
  
</nav>
  <script>$(document).ready(function(){
    // Check Radio-box
    $(".rating input:radio").attr("checked", false);

    $('.rating input').click(function () {
        $(".rating span").removeClass('checked');
        $(this).parent().addClass('checked');
    });

    $('input:radio').change(
      function(){
        var userRating = this.value;
        alert(userRating);
    }); 
});
</script>
<div class="container">

 <p><marquee width="100%" behaviour="alternate" bgcolor="Crimson" scrollamount="10"><font speed="10"color="white" size="5"><b>
  Don't touch your eyes,nose and mouth.</b></font></marquee></p>
  
</div>



<h1><center><font color=black><b>Feedback</b></center></h1><br>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
  <div class="rating">
    <span><input type="radio" name="rating" id="str5" value="5"><label for="str5"></label></span>
    <span><input type="radio" name="rating" id="str4" value="4"><label for="str4"></label></span>
    <span><input type="radio" name="rating" id="str3" value="3"><label for="str3"></label></span>
    <span><input type="radio" name="rating" id="str2" value="2"><label for="str2"></label></span>
    <span><input type="radio" name="rating" id="str1" value="1"><label for="str1"></label></span>
</div>
 <script>
 $(document).ready(function(){
    // Check Radio-box
    $(".rating input:radio").attr("checked", false);

    $('.rating input').click(function () {
        $(".rating span").removeClass('checked');
        $(this).parent().addClass('checked');
    });

    $('input:radio').change(
      function(){
        var userRating = this.value;
        alert(userRating);
    }); 
    
    $( "#buttonId" ).click(function() {
    	  alert( "Feedback Submited Successfully" );
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
  margin-left: 30em;
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
.rating {
    float:center;
    width:300px;
	margin-left:10em;
}
.rating span { float:right; position:relative; }
.rating span input {
    position:absolute;
	float:center;
    top:100px;
    left:100px;
    opacity:0;
}
.rating span label {
    display:inline-block;
    width:30px;
    height:30px;
    text-align:center;
    color:#FFF;
    background:#704241;
    font-size:30px;
    margin-right:2px;
    line-height:30px;
    border-radius:50%;
    -webkit-border-radius:50%;
}
.rating span:hover ~ span label,
.rating span:hover label,
.rating span.checked label,
.rating span.checked ~ span label {
    background:#F90;
    color:#FFF;
}
input
{

}
h
{
font-size=20px;
}
</style>

 
<font size="5" >Rate Here</font>
<br><table><br>
<font size="5" >Please leave your feedback below</font>
<tr><td>Enter Username<td><input type="text" name="t1" size=20 /></tr>
<tr><td>Enter Your Email<td><input type="password" name="t2" size=20 /></tr>
<tr><td>Type your Feedback<td><textarea name=t5 rows="3" cols="23"></textarea></tr>

<tr><td><input type="button" value="Submit" id="buttonId"/></tr>


</table> 
   
</center>



</body>
</html>