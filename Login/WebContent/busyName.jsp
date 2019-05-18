<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Account</title>
</head>
<h1>The Name <%= request.getParameter("name")%> Is Already In Use</h1>
<p>Please enter another name and password.</p>
<body>
<form action="Creation" method="post">  
<p>User Name: <input name = "name" type = "text"></p>
<p>Password: <input name = "password" type = "text"> <button type = "submit">Login</button></p>
</form>
</body>
</html>