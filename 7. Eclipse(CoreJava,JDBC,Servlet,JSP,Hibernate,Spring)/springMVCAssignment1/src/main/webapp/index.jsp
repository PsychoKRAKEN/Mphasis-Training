
<html>
<head>
<style>
  .card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  padding: 16px;
  text-align: center;
  background-color: white;

}
</style>

</head>
<body>
<div class="card">
<form action="hello.html" method="post">
<fieldset><legend>Employee Information</legend><BR>
<table>

<tr><td>Empno:</td><td><input type="text" name="t1"/></td> </tr> 
<tr><td>Name:</td><td><input type="text" name="t2"/></td></tr> 
<tr><td>Designation:</td><td><input type="text" name="t3"/></td></tr> 
<tr><td>salary:</td><td><input type="text" name="t4"/></td></tr> 
<tr><td>Address:</td><td><input type="text" name="t5"/></td></tr> 
<tr><td>phone:</td><td><input type="text" name="t6"/></td></tr> 

 
<tr><td colspan=2><input type="submit" value="Insert" name="button"/>&nbsp;&nbsp;<input type="submit" value="Delete" name="button" /></td></tr>
<tr><td colspan=2><input type="submit" value="Update" name="button"/>&nbsp;&nbsp;<input type="submit" value="Select" name="button"/></td></tr>
<tr><td><input type="submit" value="SelectId" name="button"/></tr>


</table>
</fieldset>  
</form>
</div> 
</body>
</html>