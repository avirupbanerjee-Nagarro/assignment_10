<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">


<title>Login</title>
</head>
<body>
<br><br>
<h2 align="center">Login</h2>
<br><br><br>
<hr>
<br><br><br><br><br>
	<div id="login" align="center">
		<form action="loginAuthenticator" method="post">
			<label>username:&nbsp;&nbsp;&nbsp;<input type="text" name="id"></label> 
			<br><br>
			<label>password:&nbsp;&nbsp;&nbsp;<input type="text" name="password"></label>
			<br><br> 
			<input type="submit"> 
			<br>
		</form>
		<br>
		<form action="forgot" method="post">
			<input type="submit" value="forgot passsword">
		</form>
	</div>

</body>
</html>