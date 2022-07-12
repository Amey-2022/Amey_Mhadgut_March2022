package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LabPracJDBC
 */
@WebServlet("/LabPracJDBC")
public class LabPracJDBC extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ameymhadgut_019_juhu", "root", "cdac");
			
			String str= "select * from tbl_employee";
			Statement st=conn.createStatement();
			ResultSet set=st.executeQuery(str);
			
			PrintWriter out = response.getWriter();
			
			out.write("<html><body>");
			
			
			
			
			while(set.next())
			{
				
				int empid=set.getInt(1);
				String empname=set.getString(2);
				
				
				out.write("<h1>" + empid +" "+ empname+"</h1> " );
			}
			
			out.write("</body></html>");
			conn.close();
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
