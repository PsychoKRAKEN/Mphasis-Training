<%@ page import="java.util.*" %>
<jsp:useBean id="sr" scope="page" class="shopingcart.shopping" /> 
<html>
<head>
<link rel="stylesheet" href="style.css">
</head>
<body>
<%
String name=request.getParameter("name");
String address=request.getParameter("address");

ArrayList<String> arr = new ArrayList<>();


for(int x=1;x<=10;x++)
{
	arr.add(request.getParameter("item"+x));
}

for (String str : arr)
{
	if(str!=null)
	{%>
		<jsp:setProperty name="sr" property="product" value="<%= str %>" />
	<% }
}

%>

<div id="mainid">

<div class="wrapper">

      <div class="title">Your Order is Confirmed</div>
      <form>
      <div class="field">
          <input type="text" name="name" value="<%=name%>">
          <label>Name</label>
      </div>
      <div class="field">
          <input type="text" name="address" value="<%=address%>">
          <label>Address</label>
      </div>
      <div class="field">
          <input type="text" name="totalamt" value="<jsp:getProperty name="sr" property="price" />">
          <label>Total Amount</label>
      </div>
      </form>
      </div>
      </div>




</body>
</html>