<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>${ message }</h3>
<form action="login.cdac">
Enter email id : <input type="email" name="email" /> <br />
Enter password : <input type="password" name="password" /> <br />
<button type="submit">Login</button>
</form>
</body>
</html>