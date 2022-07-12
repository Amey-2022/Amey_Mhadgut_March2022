package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/age") //url pattern
public class Birth_Date extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String str=request.getParameter("date");
		
		LocalDate today=LocalDate.now();
		LocalDate birthdate=LocalDate.parse(str);
		Period p=Period.between(birthdate, today);
		
		
		 
		PrintWriter out = response.getWriter();
		
		out.write("<html><body>");
		out.write("<h1>Age is: "+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days </h1>");
		out.write("</body></html>");
		
	}

	
	
}
