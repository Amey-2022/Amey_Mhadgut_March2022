package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdac.dao.CustomerDao;
import com.cdac.entity.Customer;
import com.cdac.exception.CustomerServiceException;

//service classes are used for writing business logic in our applications
@Component
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public void register(Customer customer) {
		if(customerDao.isCustomerPresent(customer.getEmail()))
			throw new CustomerServiceException("Customer already registered!");
		else
			customerDao.add(customer);
			//sendConfirmationMail(customer);
	}
	
	public Customer login(String email, String password) {
		if(customerDao.isCustomerPresent(email, password))
			return customerDao.fetch(email);
		else
			throw new CustomerServiceException("Email/Password incorrect!");
	}
}
