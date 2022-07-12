package com.cdac.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifecycleServlet
 */
@WebServlet("/LifecycleServlet")
public class LifecycleServlet extends HttpServlet {

	public LifecycleServlet() {
		System.out.println("Constructor called..");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init called..");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service called..");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy called..");
	}

}
