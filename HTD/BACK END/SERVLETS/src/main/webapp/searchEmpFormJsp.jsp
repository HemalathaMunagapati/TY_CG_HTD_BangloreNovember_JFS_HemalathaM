<%@page import="com.caps.mywebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%EmployeeInfoBean employeeInfoBean=(EmployeeInfoBean)request.getAttribute("employeeInfoBean"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Search Employee</legend>
		<form action="./searchEmployee3" method="get">
			Employee ID:<input type="number" name="empId" required><br>
			<input type="submit" value="search">
		</form>
	</fieldset>
	<br>
	<br>
	<% if(employeeInfoBean==null){  %>
	<h3 style="color: yellow">Employee Id not Found!</h3>
	<%}else{ %>
	<h3 style="color: red">
		details of given Employee Id<%=employeeInfoBean.getEmpId() %></h3>
	<br> Employee Name=<%=employeeInfoBean.getEName() %>
	salary=<%=employeeInfoBean.getSalary() %>
	Age=<%=employeeInfoBean.getAge() %>
	designation=<%=employeeInfoBean.getDesignation() %>
	password=<%=employeeInfoBean.getEName() %>
	<%} %>
</body>
</html>