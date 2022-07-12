package com.cdac.service;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class Empdetails {

	public void showEmp(int id, PrintWriter out) {
		// TODO Auto-generated method stub
		int flag=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ameypatekar_20_jh", "root", "cdac");
			String str="select * from employee";
			java.sql.Statement st= conn.createStatement();
			ResultSet set=st.executeQuery(str);
			
			while(set.next())
			{
				int eid=set.getInt(1);
				
				if(id==eid) {
				
				String ename=set.getString(2);
				String dname=set.getString(3);
				float sal=set.getFloat(4);
				out.write("<html><body>");
				out.write("<h2>Employee Id : "+eid+"</br>Employee Name : "+ename+"</br>Employee Dept : "+dname+"</br>Employee Salary : "+sal+"</h2>");
				out.write("</body></html>");
				flag=1;
				
				}
				
				
			}//end of while loop
			
			if(flag==0) {
				out.write("<html><body>");
				out.write("<h2>Employee Not Present In Database</h2>");
				out.write("</body></html>");
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void insertEmp(int id1, String name, String dept, float sal1, PrintWriter out) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ameypatekar_20_jh", "root", "cdac");
			PreparedStatement st = conn.prepareStatement("insert into employee(empid, ename, dname, sal) values(?, ?, ?, ?)");
			
			st.setInt(1, id1); //substituting ? with actual value
			st.setString(2, name);
			st.setString(3, dept);
			st.setFloat(4, sal1);
			
			int i=st.executeUpdate();
			if(i>0) {
			out.write("<html><body>");
			out.write("<h2>Employee Data Inserted Successfully In Database</h2>");
			out.write("</body></html>");
			}
			else {
				out.write("<html><body>");
				out.write("<h2>Employee Already Present In Database</h2>");
				out.write("</body></html>");
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


	public void updateEmp(int id1, String name, String dept, float sal1, PrintWriter out) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ameypatekar_20_jh", "root", "cdac");
			PreparedStatement st = conn.prepareStatement("update employee set ename=?, dname=?, sal=? where empid=?");
			
			 //substituting ? with actual value
			st.setString(1, name);
			st.setString(2, dept);
			st.setFloat(3, sal1);
			st.setInt(4, id1);
			
			int i=st.executeUpdate();
			if(i>0) {
			out.write("<html><body>");
			out.write("<h2>Employee Data Updated Successfully In Database</h2>");
			out.write("</body></html>");
			}
			else {
				out.write("<html><body>");
				out.write("<h2>Employee Not Present In Database</h2>");
				out.write("</body></html>");
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	public void deleteEmp(int id1,PrintWriter out) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ameypatekar_20_jh", "root", "cdac");
			PreparedStatement st = conn.prepareStatement("delete from  employee where empid=?");
			
			 //substituting ? with actual value
			
			st.setInt(1, id1);
			
			int i=st.executeUpdate();
			if(i>0) {
			out.write("<html><body>");
			out.write("<h2>Employee Data Deleted Successfully In Database</h2>");
			out.write("</body></html>");
			}
			else {
				out.write("<html><body>");
				out.write("<h2>Employee Not Present In Database</h2>");
				out.write("</body></html>");
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	

}
