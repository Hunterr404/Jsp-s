<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
</head>
<body>
	<h1>Java Learning Center</h1>
	<table border="2" style="font-size: 26; color: red;">
		<tr>
			<td>1)Strings,Wrappers and Date</td>
			<td><c:out value="${ request.scope.EM}" /> <br />${sessionScope.PH }
				<br />${applicationScope.DOB }</br></td>
		</tr>
		</td>
		<tr>
	</table>
	</table>
</body>
</html>