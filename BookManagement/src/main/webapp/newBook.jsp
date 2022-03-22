<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<div align="center">
	<h1>Library Management System</h1>
</div>
<div align="right">
	<table>
		<th>
			Welcome ${id}
		</th> 
		<th>
			<form action="logout" method="post"><label>&nbsp;&nbsp;&nbsp;<input type="submit" value="logout">&nbsp;&nbsp;&nbsp;&nbsp;</label></form>
		</th>
	</table>
	</div>
<hr>
<br><br>
<div align="center">
	<h2>Add Book Details</h2>
		<form action="saveBook" method="post">
			<label>Book Code <input type="text" name="code"></label><br><br>
			<label>Book Name <input type="text" name="name"></label><br><br>
			<label>Book Author <input type="text" name="author"></label><br><br>
			<label>Added On</label><br><br>
			<input type="submit" value="submit">
		</form>
</div>
<br>
</body>
</html>