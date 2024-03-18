<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,com.doctorapp.model.Doctor" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Doctor> doctors = (List)request.getAttribute("doctorsList");%>
<% for(Doctor doctor:doctors){ %>
<%= doctor %><br>
<%} %>
</body>
</html>