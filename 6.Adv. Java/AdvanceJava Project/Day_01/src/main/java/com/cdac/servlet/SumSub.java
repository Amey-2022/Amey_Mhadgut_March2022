package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/sumsub") //url pattern
public class SumSub extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double num1 = Double.parseDouble(request.getParameter("number1"));
		double num2=Double.parseDouble(request.getParameter("number2"));
		String str= request.getParameter("b");
		
		response.setContentType("text/html");
		double result =0;
		if(str.equals("+"))
		{
			result = num1+num2;
		}
		else if(str.equals("-"))
		{
			result = num1-num2;
		}
		else if(str.equals("*"))
		{
			result = num1*num2;
		}
		else
		{
			result = num1/num2;
		}
		
		 
		PrintWriter out = response.getWriter();
		
		out.write("<html><body>");
		out.write("<h1>Answer is: " + result + "</h1>");
		out.write("</body></html>");
		
	}

	
	
}
