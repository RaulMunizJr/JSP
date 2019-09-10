<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Map, java.util.HashMap, java.util.Iterator, java.util.Map.Entry"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Count</title>
</head>
<body>
<div id="page" class="center">
		<div id="main">
			<div id="content">
				<div id="form">
					<h2>Category Count</h2>
					<form name="search-book"
						action="<%=request.getContextPath()%>/BookServlet" method="post">
						<input type="hidden" id="page" name="page" value="categoryCount">
						<input type="text" name="category"> 
						<input type="submit" value="Category Count"> <br>
						<br><br>
						<table name="search-results" border="1">
							<tr>
								<th>Category</th>
								<th>Count</th>
							</tr>
							<%
							Map<String, Integer> bookMap = (HashMap<String, Integer>) request.getAttribute("cList");
							if(bookMap != null) {
								Iterator<Entry<String,Integer>> it = bookMap.entrySet().iterator();
								while(it.hasNext())
								{
									Map.Entry<String,Integer> display = (Map.Entry<String,Integer>) it.next();
  
						%>
							<tr>
								<td><%= display.getKey() %></td>
								<td><%= display.getValue() %></td>
							</tr>

							<%
								}
							}
							
						%>
						</table>

					</form>

				</div>
			</div>
		</div>
	</div>
</body>
</html>