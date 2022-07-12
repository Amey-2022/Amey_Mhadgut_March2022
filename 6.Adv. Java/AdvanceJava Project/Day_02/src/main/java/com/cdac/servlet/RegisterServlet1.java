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



/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet1")
public class RegisterServlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=0;
		long mob=0;
		String name="",email="",uname="",pass="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ameymhadgut_019_juhu", "root", "cdac");
			String str="select * from tbl_customer";
			Statement st=conn.createStatement();
			ResultSet set=st.executeQuery(str);
			PrintWriter out = response.getWriter();
			out.write("<html><body>");
			out.write("<h1>Registration Table</h1>");
			while(set.next())
			{
				id=set.getInt(1);
				name=set.getString(2);
				email=set.getString(3);
				mob=set.getLong(4);
				uname=set.getString(5);
				pass=set.getString("password");
				out.write("<h1>"+id+" "+name+" "+email+" "+mob+" "+uname+" "+pass+"</h1>");
			}
			out.write("</body></html>");
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}