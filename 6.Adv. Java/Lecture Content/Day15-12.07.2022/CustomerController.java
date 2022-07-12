package com.cdac.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdac.entity.Customer;
import com.cdac.exception.CustomerServiceException;
import com.cdac.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/login.cdac")
	public String login(HttpServletRequest request, Map model) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			Customer customer = customerService.login(email, password);
			model.put("customerData", customer);
			return "welcome.jsp";
		}
		catch(CustomerServiceException e) {
			model.put("message", e.getMessage());
			return "login.jsp";
		}
	}
	
	@RequestMapping("/register.cdac")
	public String register(HttpServletRequest request, Map model) {
		Customer customer = new Customer();
		customer.setName(request.getParameter("name"));
		customer.setEmail(request.getParameter("email"));
		customer.setPassword(request.getParameter("password"));
		customer.setMobileNumber(request.getParameter("mobileNumber"));
		
		try {
			customerService.register(customer);
			return "thankyou.jsp";
		}
		catch(CustomerServiceException e) {
			model.put("message", e.getMessage());
			return "register.jsp";
		}
	}
}
