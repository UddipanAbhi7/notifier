<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="index_design.css">

</head>
<body>
	<div id="log">
		<h1>Login</h1>
		<form action="Login">
			<label for="username">Username: </label>
			<input type="text" name="username" id="username" required>
			<br>
			<br>
			<label for="password">Password: </label>
			<input type="password" name="password" id="password" required>
			<br>
			<br>
			<button type="submit">Login</button>
			<br>
			<span style="color : red"> ${arr}</span>
		</form>	
	</div>
</body>
</html>