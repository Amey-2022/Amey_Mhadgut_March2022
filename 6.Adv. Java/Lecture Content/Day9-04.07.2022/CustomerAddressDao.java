package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Address;
import com.cdac.entity.Customer;
import com.cdac.entity.Employee;

public class CustomerAddressDao {

	public void add(Customer cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(cust); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}

	public void update(Customer cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.merge(cust); //merge method will generate update query
		
		tx.commit();
		emf.close();
	}

	public Customer fetchCustomer(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		//find method generates select query where pk = ?
		Customer emp = em.find(Customer.class, id);
		
		emf.close();

		return emp;	
	}

	public List<Customer> fetchCustomersByEmail(String domain) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select c from Customer c where c.email like :em");
		q.setParameter("em", "%" + domain + "%");
		List<Customer> list = q.getResultList();
		
		emf.close();

		return list;
	}

	public List<Customer> fetchCustomersByCity(String city) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select c from Customer c join c.address a where a.city = :ct");
		q.setParameter("ct", city);
		List<Customer> list = q.getResultList();
		
		emf.close();

		return list;
	}

	public Address fetchAddressByCustomerName(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select a from Customer c join c.address a where c.name = :nm");
		q.setParameter("nm", name);
		Address addr = (Address) q.getSingleResult();
		
		emf.close();

		return addr;
	}

	public void add(Address addr) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(addr); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}

	public Address fetchAddress(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		//find method generates select query where pk = ?
		Address addr = em.find(Address.class, id);
		
		emf.close();

		return addr;	
	}

}
