<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  out.println("SessionId "+session.getId()+"<br>");
  out.println("Maxinactive "+session.getMaxInactiveInterval()+"<br>");
  String username = (String)session.getAttribute("username");  
  out.print("Welcome "+username);

  List<String> movies = (List<String>)request.getAttribute("movieList");
 out.println(movies);
%>
</body>
</html>