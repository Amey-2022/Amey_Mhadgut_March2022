package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet3")
public class RegisterServlet3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=0;
		long mob=0;
		String name="",email="",uname="",pass="";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ameymhadgut_019_juhu", "root", "cdac");
			
			String str= "select * from tbl_customer";
			Statement st=conn.createStatement();
			ResultSet set=st.executeQuery(str);
			
			PrintWriter out = response.getWriter();
			out.write("<html>");
			out.write(" <style>\r\n"
					+ "        table,th,td{\r\n"
					+ "            border: 1px solid;\r\n"
					+ "            background-color: rgba(246, 255, 240, 0.692);\r\n"
					+ "            color: rgb(0, 0, 0);\r\n"
					+ "            text-align: center;\r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "        body{\r\n"
					+ "            background-color: rgba(229, 255, 0, 0.815);\r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "    </style>");
			
			
			out.write("<body>");
			out.write("<h1 style=\"text-align:center ;\">Customer Table</h1>\r\n"
					+ "    <table style=\"width: 100%;\">\r\n"
					+ "    <tr>\r\n"
					+ "        <th>ID</th>\r\n"
					+ "        <th>Name</th>\r\n"
					+ "        <th>Email</th>\r\n"
					+ "        <th>Mobile Number</th>\r\n"
					+ "        <th>Username</th>\r\n"
					+ "        <th>Password</th>\r\n"
					+ "    </tr>");
			
			
			
			
			while(set.next())
			{
				id=set.getInt(1);
				name=set.getString(2);
				email=set.getString(3);
				mob=set.getLong(4);
				uname=set.getString(5);
				pass=set.getString("password");
				
				
				out.write(" <tr>\r\n"
						+ "        <td>"+id+"</td>\r\n"
						+ "        <td>"+name+"</td>\r\n"
						+ "        <td>"+email+"</td>\r\n"
						+ "        <td>"+mob+"</td>\r\n"
						+ "        <td>"+uname+"</td>\r\n"
						+ "        <td>"+pass+"</td>\r\n"
						+ "    </tr>");
				
			}
			
			out.write("</body></html>");
			conn.close();
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	   
	}

	
	
}
