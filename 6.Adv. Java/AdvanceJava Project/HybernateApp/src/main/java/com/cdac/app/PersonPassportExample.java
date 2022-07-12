package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import com.cdac.dao.PersonPassportDao;
import com.cdac.entity.Passport;
import com.cdac.entity.Person;

public class PersonPassportExample {
	
	
	public static void main(String[] args) {
		PersonPassportDao dao=new PersonPassportDao();
		
	/*	Person p =new Person();
		p.setName("Shiv");
		p.setEmail("shiv@outlook.com");
		p.setDateOfBirth(LocalDate.of(1999, 7, 27));
		
		Passport ps=new Passport();
		ps.setIssueDate(LocalDate.of(2018, 12, 14));
		ps.setExpiryDate(LocalDate.of(2028, 12, 13));
		ps.setIssuedBy("Govt. of India");
		
		p.setPassport(ps);
		ps.setPerson(p);
		
		dao.add(p); */
		
		
	/*	Person p=dao.fetchPersonByPassportNo(3);
		System.out.println(p.getName()+" "+p.getEmail());  */
		
		List<Person> list=dao.fetchPassportByExpiry(2030);
		for(Person p: list)
			System.out.println(p.getName()+" "+p.getEmail());
		
		
		
		
	}
}
