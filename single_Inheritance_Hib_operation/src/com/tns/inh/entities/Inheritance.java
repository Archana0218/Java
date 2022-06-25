package com.tns.inh.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inheritance {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		

		//create one employee
		Employee employee = new Employee();
		employee.setName("yug");
		employee.setSalary(5000);
		em.persist(employee);

		// create one manager
		Manager manager = new Manager();
		manager.setName("prisha");
		manager.getdept_name("Acc");
		em.persist(manager);

		manager.setName("krish");
		manager.getdept_name("Acc");
		em.persist(manager);
		em.getTransaction().commit();
		System.out.println("Added one employee and manager in database");
		em.close();
		factory.close();

	}
}
