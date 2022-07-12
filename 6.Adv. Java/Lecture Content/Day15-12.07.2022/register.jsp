<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
<h2>${ message }</h2>
<form action="register.cdac">
Enter your name : <input type="text" name="name" /> <br />
Enter email address : <input type="email" name="email" /> <br />
Enter password : <input type="password" name="password" /> <br />
Enter mobile number : <input type="text" name="mobileNumber" /> <br />
<button type="submit">Register</button>
</form>
</body>
</html>