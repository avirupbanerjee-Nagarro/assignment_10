<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@page language="java" import="com.nagarro.avirup.model.Book"%>
<%@page language="java" import="java.util.*"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
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
	<table>
		<th>
			<h2>Book Listing</h2>
		</th> 
		<th>
			<form action="addBookForm"><label>&nbsp;&nbsp;&nbsp;<input type="submit" value="Add a Book" style="background:skyblue; border-radius: 10px"></label></form>
		</th>
	</table>
	</div>
	<br>
	
	<div align="center">
	<table style="width: 700px" border="1px">
		<tr>
			<th>Book Code</th>
			<th>Book Name</th>
			<th>Author</th>
			<th>Date Added</th> 
			<th>Actions</th>
		</tr>
		<tr>
		<% List<Book> list = (List)session.getAttribute("listBooks");

		System.out.println("-----------------------------------------------");
	
		if(list != null){
			if(list.size() > 0){
		for (Book b : list) {
			
		%>
			
			<td><%= b.getCode()%></td>
			<td><%= b.getName()%></td>
			<td><%= b.getAuthor()%></td>
			<td><%= b.getDate()%></td>
			<td><a href="update/<%=b.getId()%>">update</a>
			<a href="delete/<%=b.getId()%>">delete</a></td>
			<!--<td><a href="update">update</a></td> -->
		</tr> 
		<% }}
		}
		%>
	</table>
</div> 
	
</body>
</html>