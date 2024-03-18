<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>USer Details</h2>

<%
   String username = (String)request.getAttribute("myname");   
   String city = (String)request.getAttribute("city");
   String gender = (String)request.getAttribute("gender");
   String course = (String)request.getAttribute("course");
   
out.println("Name: "+username+"<br>");
   out.println("City: "+city+"<br>");
   out.println("Gender: "+gender+"<br>");
   out.println("Selected course: "+course+"<br>");
   %>
</body>
</html>