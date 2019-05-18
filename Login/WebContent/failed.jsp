<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Information Incorrect</title>
</head>
<body>
<h1>Please Try Again</h1>
<p>Either your user name or password is incorrect. Please try again.</p>
<form action="LoginServlet" method="post">  
<p>User Name: <input name = "name" type = "text"></p>
<p>Password: <input name = "password" type = "text"> <button type = "submit">Login</button></p>
</form>
<a href = "create.jsp"> Create New Account</a>
</body>
</html>