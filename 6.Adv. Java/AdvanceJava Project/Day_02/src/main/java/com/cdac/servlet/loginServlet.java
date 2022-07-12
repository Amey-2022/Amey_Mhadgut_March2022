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

//import com.cdac.service.LoginService;


@WebServlet("/login")
public class loginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		String uname,pass;
		int flag=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ameymhadgut_019_juhu", "root", "cdac");
			String str="select * from tbl_customer";
			Statement st=conn.createStatement();
			ResultSet set=st.executeQuery(str);
			PrintWriter out = response.getWriter();
			while(set.next())
			{
				
				uname=set.getString(5);
				pass=set.getString("password");
				if(username.equals(uname)&&password.equals(pass))
				{
					flag=1;
					break;
				}
						
			}//end of while loop
			
			if(flag==1) {
				response.sendRedirect("welcome.html");
			}
			else {
				response.sendRedirect("login.html");
			}
									
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}