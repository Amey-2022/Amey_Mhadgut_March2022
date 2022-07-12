package com.cdac.app;

import java.util.List;

import com.cdac.dao.EmployeeDao;
import com.cdac.entity.Employee;

public class InsertEmployee {

	public static void main(String[] args) {
		/*Employee emp = new Employee();
		emp.setEmpno(1003);
		emp.setName("Nisha");
		emp.setSalary(10000);
		emp.setDateOfJoining(LocalDate.of(2022, 10, 10));

		EmployeeDao dao = new EmployeeDao();
		dao.add(emp);*/
		
		/*EmployeeDao dao = new EmployeeDao();
		Employee emp = dao.fetch(1002);
		System.out.println(emp.getName() + " " + emp.getSalary());*/
		
		EmployeeDao dao = new EmployeeDao();
		List<Employee> list = dao.fetchAll();
		for(Employee emp : list)
			System.out.println(emp.getEmpno() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());

		System.out.println(".............");
		List<Employee> list2 = dao.fetchAllBySalary(5000);
		for(Employee emp : list2)
			System.out.println(emp.getEmpno() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());
		
		/*System.out.println("..............");
		List<String> names = dao.fetchAllNames();
		for(String name : names)
			System.out.println(name);
		
		System.out.println("..............");
		List<Object[]> namesAndSalaries = dao.fetchAllNamesAndSalaries();
		for(Object[] arr : namesAndSalaries)
			System.out.println(arr[0] + " " + arr[1]);*/
		
}
	/*public static void main(String[] args) {
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
	}*/
	
}
