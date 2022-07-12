<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Display JSP</title>
</head>
 <style>
        table,th,td{
            border: 1px solid;
            background-color: rgba(246, 255, 240, 0.692);
            color: rgb(0, 0, 0);
            text-align: center;
        }

        body{
            background-color: rgba(229, 255, 0, 0.815);
        }
    </style>
    
 
<body>
	<%@ page import= "java.sql.*"  %>
	
	<%
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ameymhadgut_019_juhu", "root", "cdac");
		
		String str= "select * from tbl_customer";
		Statement st=conn.createStatement();
		ResultSet set=st.executeQuery(str);
		
		
	%>	
	
	<h1 style="text-align:center ;">Customer Table</h1>
    <table style="width: 100%;">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Mobile Number</th>
        <th>Username</th>
        <th>Password</th>
    </tr>
    
    <%
    while(set.next())
	{
		int id=set.getInt(1);
		String name=set.getString(2);
		String email=set.getString(3);
		long mob=set.getLong(4);
		String uname=set.getString(5);
		String pass=set.getString("password");	
    %>
	
	<tr>
        <td><%=id%></td>
        <td><%=name%></td>
        <td><%=email%></td>
        <td><%=mob%></td>
        <td><%=uname%></td>
        <td><%=pass%></td>
    </tr>
    <% } %>
    </table>
    
    <% }catch(Exception e) {
	e.printStackTrace();
} %>
</body>
</html>