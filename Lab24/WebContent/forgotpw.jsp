<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>JLC Tech Support</h1>
		<h2>Password Assistance Form</h2>
		<font color="red" size=5>${MSG}</font>
		<form action="forgotpw.jlc" method="post">
			<table>
				<tr>
					<td>Email Id</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Submit" /></td>
				</tr>
			</table>
		</form>
</center>
</body>
</html>