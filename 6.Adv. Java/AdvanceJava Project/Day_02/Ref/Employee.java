package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.service.Empdetails;


@WebServlet("/Employee")
public class Employee extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("empid");
		String name=request.getParameter("empname");
		String dept=request.getParameter("deptname");
		String sal=request.getParameter("salary");
		
		PrintWriter out = response.getWriter();
		
		int id1=Integer.parseInt(id);
		float sal1=0.0f;
		
		Empdetails emp=new Empdetails();
		
		//
		//emp.updateEmp(id,name,dept,sal);
		//emp.deleteEmp(id);
		
		String btn=request.getParameter("button");
		switch(btn) {
		case "Insert": sal1=Float.parseFloat(sal);
						emp.insertEmp(id1,name,dept,sal1,out);
						break;
		case "Update": sal1=Float.parseFloat(sal);
						emp.updateEmp(id1,name,dept,sal1,out);
						break;
		
		case "Show":emp.showEmp(id1,out);
						break;
		case "Delete":emp.deleteEmp(id1,out);
						break;
		
		}
		
				
	}



}
