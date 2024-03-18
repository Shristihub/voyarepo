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
 pageContext.setAttribute("message", "welcome");
 request.setAttribute("message","Good Day in request");
 session.setAttribute("message","Great Day in session");
 application.setAttribute("message","Fun Day in application");
%>

<h2>Using Scripting</h2>
<%
String msg1 = (String)request.getAttribute("message"); // HttpServletRequest
String msg2 = (String)session.getAttribute("message"); //HttpSession
String msg3 = (String)application.getAttribute("message"); //ServletContext
%>
<%=msg1 %><br>
<%=msg2 %><br>
<%=msg3 %><br>

<h2>Using EL</h2>
${message }
${requestScope.message}
${sessionScope.message}
${applicationScope.message}




</body>
</html>