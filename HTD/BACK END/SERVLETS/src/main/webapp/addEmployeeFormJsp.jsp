<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <% String msg=(String)request.getAttribute("msg"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4> <a href="./homePageJsp">Home</a> </h4>
<fieldset>
		<legend>Add Employee</legend>
		<form action="./addEmployee2" method="post">
			<table>
				<tr>
					<td>Employee ID</td>
					<td>:</td>
					<td><input type="number" name="empId" required>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td>:</td>
					<td><input type="text" name="name" required>
				</tr>
				<tr>
					<td>Salary</td>
					<td>:</td>
					<td><input type="number" name="salary" required>
				</tr>

				<tr>
					<td>Age</td>
					<td>:</td>
					<td><input type="number" name="age" required>
				</tr>
				<tr>
					<td>Designation</td>
					<td>:</td>
					<td><input type="text" name="designation" required>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password" required>
				</tr>
				<tr>
					<td colspan="3" align="center"><br> <input type="submit"
						value="Add"></td>

				</tr>
			</table>

		</form>
	</fieldset>
	<br>
	<br>
	<% if(msg!=null){ %>
	<h3 style="color: green"><%=msg %></h3>
	<%}else{ %>
	<h3 style="color: red"><%=msg %></h3>
	<%} %>
</body>
</html>