package com.cdac.app;

import java.time.LocalDate;

import com.cdac.dao.PersonPassportDao;
import com.cdac.entity.Passport;
import com.cdac.entity.Person;

public class PersonPassportExample {

	public static void main(String[] args) {
		PersonPassportDao dao = new PersonPassportDao();
		
		Person p = new Person();
		p.setName("Swapnil");
		p.setEmail("swapnil@gmail.com");
		p.setDateOfBirth(LocalDate.of(1999, 5, 15));
		
		Passport ps = new Passport();
		ps.setIssueDate(LocalDate.of(2020, 10, 30));	
		ps.setExpiryDate(LocalDate.of(2030, 10, 30));
		ps.setIssuedBy("Govt. of India");
		
		p.setPassport(ps);
		ps.setPerson(p);
		
		dao.add(p);
	}
}
