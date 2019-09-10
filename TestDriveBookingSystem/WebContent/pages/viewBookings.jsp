<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.beans.Booking"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Bookings</title>
<link rel="stylesheet" href="../css/styles.css">
</head>
<body>
	<div class="topnav">
   <img src="https://www.android.com/static/2016/img/auto/logos/tata-motors_w_1x.jpg">
</div>

<div class="content" style=text-align:center>
  <h2 style=text-align:center>View Bookings</h2>
  <form name="search-book"
						action="<%=request.getContextPath()%>/BookingServlet" method="post">
						<input type="hidden" id="page" name="page" value="searchBook">
						<input type="text" name="category"> 
						<input type="submit" value="Search Book"> <br>
						<br><br>
						<table name="search-results" border="1" align="center">
							<tr>
								<th>ID</th>
								<th>Name</th>
								<th>License Number</th>
								<th>Make</th>
								<th>Date</th>
							</tr>
							<%
							List<Booking> bookList = (List<Booking>) request.getAttribute("bList");
							if(bookList != null) {
								
								for(Booking book: bookList) {
						%>
							<tr>
								<td><%= book.getBookId() %></td>
								<td><%= book.getCustomerName() %></td>
								<td><%= book.getLicenseNo() %></td>
								<td><%= book.getVehicleMake() %></td>
								<td><%= book.getProposedDate() %></td>
							</tr>

 
							<%
								}
							}
						%>
						</table>

					</form>
</div>
<div class="footer" style=text-align:center>
  <p> <a href="https://www.tatamotors.com">www.tatamotors.com</a></p>
</div>
<script src="https://code.jquery.com/jquery.min.js"></script>
<script src="../js/scripts.js"></script>
</body>
</html>