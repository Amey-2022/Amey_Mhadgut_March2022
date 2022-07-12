package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TatkalBookingServlet
 */
//@WebServlet("/TatkalBookingServlet2")
public class TatkalBookingServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		ServletConfig cfg = getServletConfig();
		LocalTime startTime = LocalTime.parse(cfg.getInitParameter("startTime"));
		//LocalTime endTime = LocalTime.parse(cfg.getInitParameter("endTime"));s
		
		LocalTime timeRightNow = LocalTime.now();
		
		
		//System.out.println(time.get(ChronoField.AMPM_OF_DAY));
		
		if(timeRightNow.isAfter(startTime))
			out.println("<h1>You are on time, please proceed with the booking</h1>");
		
		else 
			out.println("<h1>Sorry, Tatkal booking not allowed right now!</h1>");
		
	}

}
