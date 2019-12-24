<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>    
<%String msg=(String)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null&& !msg.isEmpty()){	%>
<%=msg %>
<%} %>



<fieldset>
		<legend>Employee Login</legend>
		<form action="./login2" method="post">
			<table>
				<tr>
					<td>Id</td>
					<td>:</td>
					<td><input type="number" name="empId" required>
				</tr>
				<tr>
					<td>password</td>
					<td>:</td>
					<td><input type="password" name="password" required>
				</tr>
				<tr>
					<td clospan='3' align='center'><br> 
					<input type="submit" value="login"></td>
						
				</tr>
			</table>
		</form>
	</fieldset>
	<h2 style="color: pink">This is JSP Page:::</h2>
</body>
</html>