package com.cdac.app;

import java.util.List;

import com.cdac.dao.PersonPassportDao;
import com.cdac.entity.Person;

public class PersonPassportExample {

	public static void main(String[] args) {
		PersonPassportDao dao = new PersonPassportDao();
		
		/*Person p = new Person();
		p.setName("Rushikesh");
		p.setEmail("rushikesh@gmail.com");
		p.setDateOfBirth(LocalDate.of(1999, 12, 25));
		
		Passport ps = new Passport();
		ps.setIssueDate(LocalDate.of(2015, 3, 15));	
		ps.setExpiryDate(LocalDate.of(2025, 3, 15));
		ps.setIssuedBy("Govt. of India");
		
		p.setPassport(ps);
		ps.setPerson(p);
		
		dao.add(p);*/
		
		/*Person p = dao.fetchPersonByPassportNo(3);
		System.out.println(p.getName() + " " + p.getEmail());*/
		
		List<Person> list = dao.fetchPersonsByPassportExpiryYear(2030);
		for(Person p : list)
			System.out.println(p.getName() + " " + p.getEmail());
	}
}
