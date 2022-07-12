package com.cdac.app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.entity.Employee;

public class InsertEmployee {

	public static void main(String[] args) {
		//During this step, the persistence.xml file will be read
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Employee emp = new Employee();
		emp.setEmpno(1002);
		emp.setName("Vipul");
		emp.setSalary(10000);
		emp.setDateOfJoining(LocalDate.of(2019, 10, 10));
		em.persist(emp); //persist method will generate insert query
		
		tx.commit();
		
		emf.close();
	}
}
