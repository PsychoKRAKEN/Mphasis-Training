<html>
<body bgcolor=pink>

<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
   $(document).ready(function() {
    //To hide the table
     $(".hidetable").click(function () {
     $(".table_bg").hide("fast")
   });
    //To show the table
     $(".showtable").click(function () {
     $(".table_bg").show(2000);
   });    
   //To hide ODD rows
     $(".hideoddrows").click(function () {
     $(".table_bg  tr:odd").hide("slow")
   });
    //To show ODD rows
     $(".showoddrows").click(function () {
     $(".table_bg  tr:odd").show(2000)
   });   
});
</script>
</head>


<nav class="navbar navbar-default">

  <div class="container-fluid">
  
    <div class="navbar-header">
	
      <a class="navbar-brand" href="#">HelpDesk For Covid19</a>
    </div>
    <ul class="nav navbar-nav">
	
      <li ><a href="homepage.jsp">Home</a></li>
      <li ><a href="slotbook.jsp">Slot Book</a></li>
	<li class="active"><a href="Doctor.jsp">Available Doctor</a></li>
	<li ><a href="bedregister.jsp">Available Bed</a></li>
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
  Cover your nose and mouth with your bent elbow or a tissue when you cough or sneeze.</b></font></marquee></p>
  
</div>




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
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>

<h2>Available /Unavailable Doctor</h2>
<button class="hidetable">Hide Table</button>
<button class="showtable">Show Table</button>
<button class="hideoddrows">Hide Odd rows</button>
<button class="showoddrows">Show Odd rows</button>

<table class="table_bg">
  <tr>
    <th>Doctor Name</th>
    <th>Availability/Non Availability</th>
    <th>04/07/2021</th>
  </tr>
  <tr>
    <td>Dr. Anila Khosla</td>
    <td>9:00 AM to 2:00 PM and 3:00 PM to 6:00 PM</td>
    <td>04/07/2021</td>
  </tr>
  <tr>
    <td>Dr. Ashfaque Hussain</td>
    <td>Duty off day</td>
    <td>04/07/2021</td>
  </tr>
  <tr>
    <td>Dr. Zeenat</td>
    <td>9:00 AM to 1:00 PM</td>
    <td>05/07/2021</td>
  </tr>
  <tr>
    <td>Dr. Lily Khosa</td>
    <td>2:00 PM to 8:00 PM</td>
    <td>05/07/2021</td>
  </tr>
  <tr>
    <td>Dr. Renu Misurya</td>
    <td>8:00 PM to 8:00 AM of the next day (Physically Available)</td>
    <td>05/07/2021</td>
  </tr>
  <tr>
    <td>Dr. Ajay Kumar Jain</td>
    <td>9:00 AM to 2:00 PM</td>
    <td>05/07/2021</td>
  </tr>
  <tr>
    <td>Dr. Panger Lemba</td>
    <td>9:00 AM to 1:00 PM</td>
    <td>05/07/2021</td>
  </tr>
  <tr>
    <td>Dr. Rajlaxmi</td>
    <td>On leave</td>
    <td>05/07/2021</td>
  </tr>
  <tr>
    <td>Dr. Yasmeen Raunaq</td>
    <td>9:00 AM to 2:00 PM and 3:00 PM to 6:00 PM</td>
    <td>05/07/2021</td>
  </tr>
  <tr>
    <td>Dr. Abhishek Gupta</td>
    <td>9:00 AM to 1:00 PM</td>
    <td>05/07/2021</td>
  </tr>
</table>

</body>
</html>