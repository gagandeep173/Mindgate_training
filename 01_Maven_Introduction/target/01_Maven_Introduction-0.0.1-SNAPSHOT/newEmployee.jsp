<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>employee details</title>
</head>
<body>
<h3> New Employee</h3>
<form action="AddNewEmployeeServlet" method="post">
Employee_id <input type="text" name="employee_id">
<br><br>
Name <input type="text" name="name" ><br>
<br><br>
Salary <input type="text" name="salary">
<br><br>
<input type="submit" value="Add"> 
<br><br>

<a href="index.jsp"></a>
</form>
</body>
</html>