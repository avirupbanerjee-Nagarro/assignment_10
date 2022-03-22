<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<br>
	<br>
	<div align="center">
		<h2>New Registration</h2>
	</div>
	<hr>
	<br><br><br>
	<div align="center">
		<form action="registerUser" method="post">
			<label>username:&nbsp;&nbsp;&nbsp;<input type="text" name="id"></label> 
			<br><br>
			<label>password:&nbsp;&nbsp;&nbsp;<input type="text" name="password"></label>
			<br><br> 
			<input type="submit" value="register"> 
			<br>
		</form>
	</div>
</body>
</html>