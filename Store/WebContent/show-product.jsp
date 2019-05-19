<%@page import="database.Item"%>
<%@page import="java.util.Map"%>
<%@page import="database.Products"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% Products pros = new Products();
Map<String, Item> items = pros.getAll();
Item curr = items.get(request.getParameter("id"));
out.print("<h1>" + curr.getName() + "</h1>");
%>
<body>
<img src="store-images/<%out.print(curr.getImage());%>" />

<form action="Shopping" method="post">
$<%out.print(curr.getPrice());%> 
<input name="id" type="hidden" value = "<%out.print(request.getParameter("id")); %>">
<button type = "submit">Add to Cart</button>
</form>
</body>
</html>


