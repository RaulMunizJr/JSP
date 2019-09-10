<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.beans.Booking"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Homepage</title>
<link rel="stylesheet" href="../css/styles.css">
</head>
<body>
	<div class="topnav">
   <img src="https://www.android.com/static/2016/img/auto/logos/tata-motors_w_1x.jpg">
</div>

<div class="content" style=text-align:center>
  <h2 style=text-align:center>Homepage</h2>
  <form name="main" action="<%=request.getContextPath()%>/tourServlet"
		method="post">

					 <a href="<%=request.getContextPath()%>/pages/viewBookings.jsp">View Bookings</a><br><br> 
			 		 <a href="<%=request.getContextPath()%>/pages/testDrivingBooking.jsp">Test Drive Booking</a><br><br> 
		 			 <a href="<%=request.getContextPath()%>/pages/cancelBooking.jsp">Cancel Test Drive</a>
	</form>
</div>
<div class="footer" style=text-align:center>
  <p> <a href="https://www.tatamotors.com">www.tatamotors.com</a></p>
</div>
<script src="https://code.jquery.com/jquery.min.js"></script>
<script src="../js/scripts.js"></script>
</body>
</html>