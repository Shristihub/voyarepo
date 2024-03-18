<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="errorHandler.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP</h1>
	<% String name = "Sri";	%>
	<%="welcome" + name %>
	<% int x = 10;int y = 20;%>
	<%="Sum " + (x + y)%>
	
	<%int counter=1; %>
	<%= counter++ %>
	<% int a =10/0; %>

</body>
</html>