<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>EDIT NOTE</h1>
	<%
			int id=Integer.parseInt(request.getParameter("id"));
			session.setAttribute("id",id);
		%>
	<form action="EditStore">
		<label for="title">Enter the title:</label>
		<input type="text" id="title" name="title" placeholder=<%=id%>>
		<br>
		<br>
		<label for="desc">Enter the description:</label>	
		<input type="text" id="desc" name="description" placeholder=<%=id%>>
		<br>
		<br>
		<input type="hidden" name="id" value="${id}">
		<button type="submit">
		Edit Done
		
		</button>
	</form>
</body>
</html>