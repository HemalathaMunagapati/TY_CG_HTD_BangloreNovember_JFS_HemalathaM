<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Information</h1>
	<form action="./register" method="post">
		<fieldset>
			<legend>Employee Details</legend>
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
		</fieldset>



		<fieldset>
			<legend>Employee Address Details 1</legend>
			<table>
				<tr>
					<td>AddressType:</td>
					<td><select name="addressBeans[0].addType">
							<option value="PermanentAddress">PermanentAddress</option>
							<option value="CurrentAddress">CurrentAddress</option>
					</select></td>
				</tr>
				<tr>
					<td>Address1:</td>
					<td><input type="text" name="addressBeans[0].address1"></td>
				</tr>
				<tr>
					<td>Address2:</td>
					<td><input type="text" name="addressBeans[0].address2"></td>
				</tr>
			</table>
		</fieldset>

		<fieldset>
			<legend>Employee Address Details 2</legend>
			<table>
				<tr>
					<td>Address:</td>
					<td><select name="addressBeans[1].addType">
							<option value="PermanentAddress">PermanentAddress</option>
							<option value="CurrentAddress">CurrentAddress</option>
					</select></td>
				</tr>
				<tr>
					<td>Address1:</td>
					<td><input type="text" name="addressBeans[1].address1"></td>
				</tr>
				<tr>
					<td>Address2:</td>
					<td><input type="text" name="addressBeans[1].address2"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Register"></td>
				</tr>

			</table>
		</fieldset>

	</form>

</body>
</html>