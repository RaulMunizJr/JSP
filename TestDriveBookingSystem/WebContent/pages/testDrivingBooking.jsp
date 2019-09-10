<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.beans.Booking"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Tour Plan</title>
<link rel="stylesheet" href="../css/styles.css">
</head>
<body>
	<div class="topnav">
   <img src="https://www.android.com/static/2016/img/auto/logos/tata-motors_w_1x.jpg">
</div>

<div class="content" style=text-align:center>
  <h2 style=text-align:center>Book Test Drive</h2>
  <p id="alert" style=color:red></p>
  <div id="page" class="center">
    <div id="main">
      <div id="content">
        <div id="form">
           <form id="homeform" name="add-booking" action="<%=request.getContextPath()%>/BookingServlet" method="post" onsubmit="return validateBooking()">
           <input type="hidden" id="page" name="page" value="addBooking">
           <table align="center">
           <tr>
              <td align="left"><label for="id">ID:</label></td>
              <td><input type="text" name="id"></td>
           </tr>
           <tr>
              <td align="left"><label for="name">Name:</label></td>
              <td><input type="text" name="name"></td>
           </tr>
           <tr>   
              <td align="left"><label for="dlnumber">Drivers License No.:</label></td>
              <td><input type="text" name="dlnumber"></td>
           </tr>
           <tr>
           <td align="left"><label for="vmake">Vehicle Make:</label></td>
           		<td>
           		<select name="vmake">
				  <option value="zest">Zest</option>
				  <option value="safari">Safari</option>
				  <option value="manza">Manza</option>
	  	   		</select>
	  	   		</td>
           </tr>
           <tr>   
              <td align="left"><label for="drivedate">Proposed Test Drive date:</label></td>
              <td><input type="text" name="drivedate"></td>
           </tr>
           </table>
           <br>
           <input type="submit" value="Add Booking">
          
          </form>
        </div>
      </div>
    </div>
  </div>
  
</div>
<div class="footer" style=text-align:center>
  <p> <a href="https://www.tatamotors.com">www.tatamotors.com</a></p>
</div>
<script src="https://code.jquery.com/jquery.min.js"></script>
<script src="../js/scripts.js"></script>
</body>
</html>