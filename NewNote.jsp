<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Note</title>

</head>
<body>
	<h1>ADD NEW NOTE</h1>
	<form action="Insert">
		<label for="title">Enter the title:</label>
		<input type="text" id="title" name="title">
		<br>
		<br>
		<label for="desc">Enter the description:</label>
		
		<input type="text" id="desc" name="description">
		<br>
		<br>
		<button type="submit">Add note</button>
	</form>
</body>
</html>