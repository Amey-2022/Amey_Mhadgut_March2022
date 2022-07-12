package com.cdac.servlet;

import java.beans.Encoder;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;
/**
 * Servlet implementation class RegisterServlet2
 */
@WebServlet("/register2.cdac")
public class RegisterServlet2 extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		long mobileNo=Long.parseLong(request.getParameter("mobileNo"));
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		//using java.util.Base64 package and encoded the password
			String BasicBase64format=Base64.getEncoder().encodeToString(password.getBytes());
			password=BasicBase64format;
	
			//String myquery="select * from tbl_customer where id=email";
			
			//jdbc code to insert the data
			//TODO: first create the table in the Database
			//create table tbl_customer(id int primary key auto_increment, name varchar(20), email varchar(30), mobileno int, username varchar(15), password varchar(8));
			//Also we need to download the jdbc driver for mysql and then
			//copy the mysql-connector-java-...jar to WEB-INF/lib folder of our project
			//TODO: store the password in encoded form in the database (use base64 encoding)
			//TODO: before inserting, you will check by firing a select query 
			//		whether there is already a customer registered by the same email address
			//		if yes, then another record should not get inserted
			
			int flag=0;
			Connection conn=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ameymhadgut_019_juhu", "root", "cdac");
				String str="select * from tbl_customer";
				
				Statement stat=conn.createStatement();
				ResultSet set=stat.executeQuery(str);
				while(set.next()) {
					String em=set.getString(3);
					if(email.equals(em)){
						flag=0;
					}else {
						flag=1;
					}
				}
				
				
				if(flag==1) {
					PreparedStatement st=conn.prepareStatement("insert into tbl_customer(name, email, mobileno, username, password) values(?, ?, ?, ?, ?)");
				
					st.setString(1, name);
					st.setString(2,email);
					st.setLong(3, mobileNo);
					st.setString(4, username);
					st.setString(5, password);
					
					st.executeUpdate();
					
					PrintWriter out=response.getWriter();
					out.write("<html><body>");
					out.write("<h1>Registeration Successful!!<h1/>");
					out.write("<body/><html/>");
				
				}else if(flag==0) {
					PrintWriter out = response.getWriter();
					out.write("<html><body>");
					out.write("<h1> email already Registered</h1>");
					out.write("</body></html>");
				}
				
				
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		
		
	
	
	}

	
	

}
