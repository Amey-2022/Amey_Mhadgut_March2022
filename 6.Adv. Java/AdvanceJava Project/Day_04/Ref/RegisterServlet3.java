package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet3")
public class RegisterServlet3 extends HttpServlet {

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ameypatekar_20_jh", "root", "cdac");
		
		String str="select * from tbl_customer ";
		 
		Statement stat=conn.createStatement();
		ResultSet set=stat.executeQuery(str);
		
		PrintWriter out = response.getWriter();
		out.write("<html>");
		out.write("<style>\r\n"
				+ "table, th, td {\r\n"
				+ "  border:1px solid white;\r\n"
				+ "  background-color:#76a4dd;\r\n"
				+ "  color:black;\r\n"
				+ "  text-align:center;\r\n"
				+ "}\r\n"
				+ "body {\r\n"
				+ "  background-color:#fff4a3;\r\n"
				+ "}\r\n"
				+ "</style>");
		out.write("<body>");
		out.write("<h1 style=\"text-align:center\">Customer Table</h1>");
		out.write("<table style=\"width:100%\">");
		out.write("<tr>\r\n"
				+ "    <th>ID</th>\r\n"
				+ "    <th>Name</th>\r\n"
				+ "    <th>Email</th>\r\n"
				+ "    <th>Mobile Number</th>\r\n"
				+ "    <th>User Name</th>\r\n"
				+ "    <th>Password</th>\r\n"
				+ "  </tr>");
		
		while(set.next()) {
			int id=set.getInt(1);
			String name=set.getString(2);
			String email=set.getString(3);
			long mob=set.getLong(4);
			String uname=set.getString(5);
			String pass=set.getString(6);
			
			out.write("  <tr>\r\n"
					+ "    <td>"+id+"</td>\r\n"
					+ "    <td>"+name+"</td>\r\n"
					+ "    <td>"+email+"</td>\r\n"
					+ "    <td>"+mob+"</td>\r\n"
					+ "    <td>"+uname+"</td>\r\n"
					+ "    <td>"+pass+"</td>\r\n"
					+ "  </tr>");
		}
			
			out.write("<table>");
			out.write("</body></html>");
			conn.close();
			
	}	catch(Exception e) {
		e.printStackTrace();
	}
		
	}

}

	

