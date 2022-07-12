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
	System.out.println("Whatever we write in a JSP goes inside the _jspService method");
%>

<%!
	public void jspInit() {
		System.out.println("jspInit");
	}

	public void jspDestroy() {
		System.out.println("jspDestroy");
	}
%>
</body>
</html>