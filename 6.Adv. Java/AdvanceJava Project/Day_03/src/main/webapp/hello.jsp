<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
<%
String str = "Hello Everyone!";
%>
<h1><%= str %></h1>
<div style="text-align: center">
	<%
		for(int i=1; i<=6; i++) {
	%>
		<font size="<%= i %>">Hello World!</font> <br />
	<%
		}
	%>
</div>
<%
	
%>
</body>
</html>