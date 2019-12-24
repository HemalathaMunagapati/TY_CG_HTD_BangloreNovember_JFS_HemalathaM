<%@page import="com.caps.mywebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>    
    
    <%HttpSession session=request.getSession(false);
    EmployeeInfoBean employeeInfoBean=(EmployeeInfoBean)session.getAttribute("employeeInfoBean"); %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color:navy;">Welcome <%=employeeInfoBean.getEName() %></h3>
<a href="./addEmployeeFormJsp">Add Employee</a><br><br>
<a href="./updateEmpJsp">Update Employee</a><br><br>
<a href="./deleteEmployeeFormJsp">Delete Employee</a><br><br>
<a href="./searchEmpFormJsp">Search Employee</a><br><br>
<a href="./seeAllEmployees">See All Employees</a><br><br>
<br><br>
<a href="./logout2">logout</a>


</body>
</html>