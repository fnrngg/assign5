<%@page import="java.text.DecimalFormat"%>
<%@page import="database.Item"%>
<%@page import="java.util.Map"%>
<%@page import="database.Products"%>
<%@page import="database.Cart"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping Cart</title>
</head>
<h1>Shopping cart</h1>
<body>
<form action="AddToCart" method="post">
<ul>
<%
	Products pros = new Products();
	Map<String, Item> items = pros.getAll();
	Cart curr = (Cart)session.getAttribute("cart");
	Map<String, Integer> currItems = curr.getFullCart();
	double total = 0;
	for(String productId : currItems.keySet()) {
		total += items.get(productId).getPrice() * currItems.get(productId);
		%><li><input type = "number" name = "count" ><%out.print(" " + items.get(productId).getName() + ", " + items.get(productId).getPrice());%>
		<input type = "hidden" name = "id" value = <%out.print(productId); %>>
		</li>
		<%
	}
	DecimalFormat df = new DecimalFormat("#.##");
%>
</ul>
<p>Total: $<%out.print(df.format(total));%>
<button type = "submit">Update Cart</button></p>
</form>
<a href = "homepage.jsp">Continue Shopping</a>
</body>
</html>



