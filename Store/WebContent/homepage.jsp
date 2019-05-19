<%@page import="database.Item"%>
<%@page import="java.util.Map"%>
<%@page import="database.Products"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Store</title>
</head>
<h1>Student Store</h1>
<body>
<p>Items available:</p>
<% Products pros = new Products();
	Map<String, Item> items = pros.getAll();
	%><ul><%
	for(String productId : items.keySet()) {
		out.print("<li><a href= \"show-product.jsp?id=" + productId + "\">" + items.get(productId).getName() + "</a></li>");
	}%></ul>
</body>
</html>