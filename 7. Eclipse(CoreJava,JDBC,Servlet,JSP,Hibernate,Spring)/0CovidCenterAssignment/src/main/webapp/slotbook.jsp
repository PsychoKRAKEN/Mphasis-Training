<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <title>Bootstrap Basics</title>
</head>

<body>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->



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


    <div class="mt-3 container-fluid">
        <form name="f1" action=slotstore.jsp method=post>
            <div class="mb-3">
                <label for="name11" class="form-label">Name</label>
                <input type="text" name=t1 class="form-control" id="name" onkeyup="myFunction()">
            </div>

            <div class="mb-3">
                <label for="aadhar1" class="form-label">Aadhar Card Number</label>
                <input type="number" class="form-control" name=t2 id="exampleInputEmail1" aria-describedby="emailHelp">
                <div id="emailHelp" class="form-text">We'll never share your Aadhar Card Number with anyone else.</div>
            </div>



            <div class="col-12 mb-3">
                <label for="inputAddress" class="form-label">Nearest Hospital</label>
                <input type="text" name=t3 class="form-control" id="inputAddress" >
            </div>
            <div class="col-12 mb-3">
                <label for="inputCity" class="form-label">City</label>
                <input type="text" name=t4 class="form-control" id="inputCity" >
            </div>
            <div class="col-12 mb-3">
                <label for="inputstate" class="form-label">State</label>
                <input type="text" name=t5 class="form-control" id="inputCity" >
            </div>
            
            <div class="col-12 mb-3">
                <label for="inputZip" class="form-label">Postal Code</label>
                <input type="text" name=t6 class="form-control" id="inputZip">
            </div>
            
            <div class="col-12 mb-3">

            <button type="button" value="Submit" class="btn btn-primary" onclick="fun()">Submit</button>
            </div>


        </form>
    </div>

    <br>
    <br>
    <hr>
    <br>
    <br>
    <br>
    <br>
    <br>

    <script>
        function myFunction() {
            var x = document.getElementById("name");
            x.value = x.value.toUpperCase();
        }


        function fun() {
            var a = f1.t1.value;
            var b = f1.t2.value;
            var c = f1.t3.value;
            var d = f1.t4.value;
            var e = f1.t5.value;
            var f = f1.t6.value;

            if (a == "") {
                alert("Enter your name");
                f1.t1.focus();
            }
            else if (b == "") {
                alert("Enter your Aadhar Card Number");
                f1.t2.focus();
            }
            else if (c == "") {
                alert("Enter your Nearest Government Hospital Name");
                f1.t3.focus();
            }
            else if (d == "") {
                alert("Enter your Nearest Private Hospital Name");
                f1.t4.focus();
            }
            else if (e == "") {
                alert("Enter your City Name");
                f1.t5.focus();
            }
            else if (f == "") {
                alert("Enter your Postal Code");
                f1.t6.focus();
            }
            else {
                
                f1.submit();
            }
        }

    </script>


</body>

</html>