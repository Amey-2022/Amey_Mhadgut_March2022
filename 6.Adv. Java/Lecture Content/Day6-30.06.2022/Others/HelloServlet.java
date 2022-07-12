package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = "/hello.cdac", loadOnStartup = 1) //url pattern
public class HelloServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("HelloServlet's init..");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloServlet's doGet..");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.write("<html><body>");
		out.write("<h1>Hello Again!</h1>");
		String str = "Hello Everyone";
		out.write("<h1>" + str + "</h1>");
		out.write("<h2>Today's Date is " + LocalDate.now()+"</h2>");
		out.write("</body></html>");
	}
}
