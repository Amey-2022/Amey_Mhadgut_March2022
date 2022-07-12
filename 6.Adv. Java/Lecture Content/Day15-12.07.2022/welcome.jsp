<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome back ${ customerData.name }</h1>
<h2>Here are your details with us!</h2>
<table>
	<tr>
		<th>Name</th><th>Email Address</th><th>Mobile Number</th>
	</tr>
	<tr>
		<td>${ customerData.name }</td>
		<td>${ customerData.email }</td>
		<td>${ customerData.mobileNumber }</td>
	</tr>
</table>
</body>
</html>