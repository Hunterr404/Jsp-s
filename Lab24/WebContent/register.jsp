<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<center>
		<h1>JLC Tech Support</h1>
		<h2>Registration Form</h2>
		<font color="red" size=5>${MSG}</font>
		<form action="register.jlc" method="post">
			<table>
				<tr>
					<td>Full Name</td>
					<td><input type="text" name="fname" /></td>
				</tr>
				<tr>
					<td>email Id</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone" /></td>
				</tr>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Register" /></td>
				</tr>

			</table>
		</form>
	</center>
</body>
</html>