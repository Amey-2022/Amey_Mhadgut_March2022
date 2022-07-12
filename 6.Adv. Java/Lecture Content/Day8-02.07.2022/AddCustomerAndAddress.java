package com.cdac.app;

import com.cdac.dao.CustomerAddressDao;
import com.cdac.entity.Address;
import com.cdac.entity.Customer;

public class AddCustomerAndAddress {

	public static void main(String[] args) {
		CustomerAddressDao dao = new CustomerAddressDao();
		
		Customer c = new Customer();
		c.setName("Majrul");
		c.setEmail("majrul@gmail");
		dao.add(c);
		
		Address a = new Address();
		a.setPincode(400001);
		a.setCity("Mumbai");
		a.setState("Maharashtra");
		dao.add(a);
	}
}
