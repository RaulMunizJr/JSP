<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Tour Plan</title>
<link rel="stylesheet" href="../css/styles.css">
</head>
<body>
	<div class="topnav">
  <a href="#">Home</a>
  <a href="#">About</a>
  <a href="#">Contact Us</a>
</div>

<div class="content" style=text-align:center>
  <h2 style=text-align:center>Create Tour Plan</h2>
	  <p><span style=color:red>*</span> - Mandatory</p>
  <form name="add-tour" action="<%=request.getContextPath()%>/tourServlet" method="post">
  <input type="hidden" id="page" name="page" value="createTour">
	    <span style=color:red>*</span>Tour Name:<br>
	  	<input type="text" name="tourname"><br>
	  	Starting Location:<br>
	  	<input type="text" name="startlocation"><br>
	  	<span style=color:red>*</span>Places of Interest:<br>
	  	<input type="text" name="placeinterest"><br>
	  	<span style=color:red>*</span>Tour Cost:<br>
	  	<input type="text" name="tourcost"><br>
	  	<span style=color:red>*</span># of Days:<br>
	  	<input type="text" name="tourdays"><br>
	  	Discount Available?<br>
	  	<label class="radio-inline">
      	<input type="radio" name="optradio" checked value="No">No
    	</label>
    	<label class="radio-inline">
      	<input type="radio" name="optradio" value="Yes">Yes
    	</label>
    	<div id="textboxes" style="display: none">
		    <span style=color:red>*</span>Enter discount % : <br>
		    <input type="text" name="discount"> 
		</div>
	  <br><br>
	  <input type="submit" value="Create Tour">
	  <input type="submit" value="Clear">
	</form> 
</div>
<div class="footer" style=text-align:center>
  <p>Copyright @Something</p>
</div>
<script src="https://code.jquery.com/jquery.min.js"></script>
<script src="../js/scripts.js"></script>
</body>
</html>