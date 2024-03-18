<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   String username = (String)request.getAttribute("myname");   
   String city = (String)request.getAttribute("city");
   String gender = (String)request.getAttribute("gender");
   String course = (String)request.getAttribute("course");
   Long mobile = (Long)request.getAttribute("mobileNum");
   String[] hobbies = (String[])request.getAttribute("hobbies");%>
   
   <%= "Name: "+username+"<br>" %>
   <%= "City: "+city+"<br>" %>
   <%= "Gender: "+gender+"<br>" %>
   <%= "Selected course: "+course+"<br>"%>
   <%= "Mobile: "+mobile+"<br>"%>
   <%= "Hobbies " %>
   <% for(String hobby:hobbies){ %>
	   <%= "hobby: "+hobby+"<br>"%>
   <%} %>
 
</body>
</html>




