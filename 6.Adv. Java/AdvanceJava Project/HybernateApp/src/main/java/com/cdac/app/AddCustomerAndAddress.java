package com.cdac.app;

import java.util.List;

import com.cdac.dao.CustomerAddressDao;
import com.cdac.entity.Address;
import com.cdac.entity.Customer;

public class AddCustomerAndAddress {

	public static void main(String[] args) {
		CustomerAddressDao dao=new CustomerAddressDao();
		
		/*	Customer c= new Customer();
		c.setName("Amey");
		c.setEmail("amey@gmail.com");
		dao.add(c);
		
		
		Address a=new Address();
		a.setCity("Kankavli");
		a.setPincode(416602);
		a.setState("Maharashtra");
		dao.add(a);		*/
		
		
		/*	Customer c=dao.fetchCustomer(1);
		Address a=dao.fetchAddress(1);
		
		c.setAddress(a);
		dao.update(c);	*/
		
		
	/*	Customer c= new Customer();
		c.setName("Babloo");
		c.setEmail("babloo@yahoo.com");
		
		Address a=new Address();
		a.setCity("Pune");
		a.setPincode(411027);
		a.setState("Maharashtra");
		
		
		
		c.setAddress(a);
		
		dao.add(c);		*/
		
			
	//	List<Customer> list=dao.fetchCustomerByEmail("yahoo");
	/*	List<Customer> list=dao.fetchCustomerByCity("kankavli");
		for(Customer c: list ) {
			System.out.println(c.getId()+" "+c.getName()+" "+c.getEmail());
		}	*/
		
		
		Address a=dao.fetchAddressByCustomerName("Amey");
		System.out.println(a.getId()+" "+a.getCity()+" "+a.getPincode()+" "+a.getState());
		
		
		
		
		
		
	}
	
}
