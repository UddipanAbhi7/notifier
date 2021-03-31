<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import ="com.notepad.NoteInfo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Notepad</title>
<link rel="stylesheet" type="text/css" href="Welcome_design.css">

</head>
<body>
	<div id="heading">
		<h1>NotePad</h1>
		<h2>Welcome ${username} </h2>
		<form action="Logout">
			<button id="lgout" type="submit" >Logout</button>
		</form>
	</div>
	
				
				<div class="nbcwrap">
				<%
				int a=0;
				ArrayList<NoteInfo> li=(ArrayList<NoteInfo>)request.getAttribute("li");
				for(int i=0;i<li.size();i++)
				{a++;
			%>
					<div class="nbc">
						<div class="nbc-lf"><%= ((a)+"/ "+li.get(i).getTitle())%></div>
						<div class="nbc-rh"><%= (li.get(i).getDescription())%></div>
						<div class="nbc-bt">
							<button>
							<a href="EditNote.jsp?id=<%=li.get(i).getId()%>">
							Edit</a></button>
							<button><a href="Delete?id=<%=li.get(i).getId()%>">Delete</a></button>
						</div>
						<div class="clear"></div>
					</div>
					<%} %>
				</div>
				
	<div id="addnote">
			<button  id="add"><a href="NewNote.jsp"><img src="https://www.pngitem.com/pimgs/m/264-2646561_vector-type-icon-plus-logo-png-green-transparent.png"></a></button>
	</div>
</body>
</html>