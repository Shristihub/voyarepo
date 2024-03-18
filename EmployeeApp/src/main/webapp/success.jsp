<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.employeeapp.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
      Employee employee =(Employee)request.getAttribute("employee");
	  String name = employee.getEmployeeName();	 %>
	 <%="Welcome "+name+"<br>" %>
	 String city = employee.getCity();
	 out.print("City "+city+"<br>");
	 
	 Integer employeeId = employee.getEmployeeId();
	 out.print("EmployeeId "+employeeId+"<br>");
	 Double salary = employee.getSalary();
	 out.print("Salary "+salary+"<br>");
	 String language = employee.getLanguage();
	 out.print("Language "+language+"<br>");
	 String[] hobbies = employee.getHobbies();
	 if(hobbies!=null)
	 	for(String hobby:hobbies)
	 		out.print("Hobby "+hobby+"<br>");
	 
	   





%>
</body>
</html>