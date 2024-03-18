<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="registerServlet">
       <table border="1" cellpadding="10" cellspacing="1">
       <tr>
         <td><label for="username">Username</label></td>
        <td><input type="text" name="employeeName" placeholder="Enter Name">
        </td>
       </tr>
       <tr>
        <td><label for="city"></label></td>
        <td><input type="text" name="city" placeholder="Enter city">
        </td>
       </tr>
        <tr>
        <td><label for="mobile"></label></td>
        <td><input type="text" name="mobile" placeholder="Enter mobile">
        </td>
       </tr>
      <tr>
        <td><label for="salary"></label></td>
        <td><input type="text" name="salary" placeholder="Enter salary">
        </td>
       </tr>
       <tr>
        <td><label for="course">Course</label></td>
        <td>
            <select name="course">
                <option value="Java">Java</option>
                <option value="Spring">Spring</option>
                <option value="Angular">Angular</option>
                <option value="Node">Node</option>
            </select>
        </td>
       </tr>
       <tr>
        <td><label for="hobbies">Hobbies</label></td>
        <td>
            <input type="checkbox" name="hobby" value="dance">Dance
            <input type="checkbox" name="hobby" value="music">Music
            <input type="checkbox" name="hobby" value="sports">Sports
            <input type="checkbox" name="hobby" value="reading">Reading
        </td>
       </tr>
      
       <tr>
        <td colspan="2"><input type="submit" value="Register">
        <input type="reset" value="Reset"></td>
       </tr>
      </table>
      </fieldset>
    </form>
</body>
</html>