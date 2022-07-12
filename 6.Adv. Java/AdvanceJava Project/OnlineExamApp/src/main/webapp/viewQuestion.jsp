<%@page import="com.cdac.model.Option"%>
<%@page import="java.util.List"%>
<%@page import="com.cdac.model.Question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<!--  <form action="QuestionLoaderServlet"> -->
<form action="CalculateScoreServlet">
<body>
<% 
	Question question= (Question) session.getAttribute("currentQs");
%>

<h3>Q. <%= question.getQuestion() %></h3>
<%
	List<Option> options=question.getOptions();
	for(int i=0;i<options.size();i++){
		Option option=options.get(i);
%>
	
	<div>
		<input type="radio" name="op" value="<%= i %>"/>
		<%=option.getOption() %>
	</div>
<% 
	} 
%>
<br/>
<!--  <a href="QuestionLoaderServlet">Next</a> -->
<button type="submit" >Next</button>
</form>
</body>
</html>