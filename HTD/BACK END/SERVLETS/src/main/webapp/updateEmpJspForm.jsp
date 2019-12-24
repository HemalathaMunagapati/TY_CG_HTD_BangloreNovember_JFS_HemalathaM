<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <% String msg=(String)request.getAttribute("msg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><a href="./homePageJsp"></a></h4>
<fieldset>
		<legend>Employee Employee</legend>
		<form action="./updateEmployee" method="post">
			<table>
				<tr>
					<td>Employee ID</td>
					<td>:</td>
					<td><input type="number" name="empId" required>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td>:</td>
					<td><input type="text" name="name" >
				</tr>
				<tr>
					<td>Salary</td>
					<td>:</td>
					<td><input type="number" name="salary">
				</tr>

				<tr>
					<td>Age</td>
					<td>:</td>
					<td><input type="number" name="age" >
				</tr>
				<tr>
					<td>Designation</td>
					<td>:</td>
					<td><input type="text" name="designation" >
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password" >
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