<%@page import="com.bookapp.model.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String msg = (String)request.getAttribute("message"); %>
<%=msg %>
<br>
<h2>Expression  language</h2>
${message}

Title: ${book.title}<br>
Price: ${book.price } <br>
Author: ${book.author }<br>
Category: ${book.category } <br>


<%-- 
<%Book book =(Book) request.getAttribute("book"); %>
Title: <%=book.getTitle() %>
Price: <%=book.getPrice() %>
Author: <%=book.getAuthor() %>
Category: <%=book.getCategory() %> --%>
</body>
</html>