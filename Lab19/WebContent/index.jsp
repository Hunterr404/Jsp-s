<%@ taglib prefix="jlc" uri="/WEB-INF/jlcindia.tld"%>
</head>
<body>
	<form action="test.jlc" method="post">
		<table align="center"></table>
		<tr>
			<td><h2>Enter Name</h2></td>
			<td><input type="text" name="fname" /></td>
			<td><jlc:error property="fname" /></td>
		</tr>
		<tr>
			<td><h2>Enter Email</h2></td>
			<td><input type="text" name="email"></td>
			<td><jlc:error property="email" /></td>
		</tr>
		<tr>
			<td align="center" colspan="3"><input type="submit" value="TEST" />
			</td>
		</tr>
	</form>
</body>
</html>