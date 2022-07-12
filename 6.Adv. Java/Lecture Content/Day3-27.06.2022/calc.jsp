<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	int no1 = Integer.parseInt(request.getParameter("no1"));
	int no2 = Integer.parseInt(request.getParameter("no2"));
	int result = no1 + no2;
%>

<h1>The sum of <%= no1 %> and <%= no2 %> is <%= result %></h1>

</body>
</html>