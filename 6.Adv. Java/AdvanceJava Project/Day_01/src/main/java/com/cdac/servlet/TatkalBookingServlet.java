package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TatkalBookingServlet
 */
//@WebServlet("/TatkalBookingServlet")
public class TatkalBookingServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletConfig cfg=getServletConfig();
		int startTime=Integer.parseInt(cfg.getInitParameter("startTime"));
		int endTime=Integer.parseInt(cfg.getInitParameter("endTime"));
		
		LocalTime time=LocalTime.now();
		int timeRightNow=time.getHour();
		
		//System.out.println(time.get(ChronoField.AMPM_OF_DAY));
		
		if(timeRightNow >= startTime && timeRightNow <= endTime) 
			out.println("<h1>You are on time, please proceed with the booking</h1>");
		else
			out.println("<h1>Sorry, Tatkal booking not allowed right now!</h1>");
		
		
		
		
	}

}
