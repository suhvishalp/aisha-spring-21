package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.entities.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create EntityManager
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPADemo1");
		EntityManager manager =  factory.createEntityManager();

		
		//persist entities 
//		Employee emp = new Employee(1, "Vishal", "Mumbai", 2999.00);
//		
//		manager.getTransaction().begin();
//		manager.persist(emp);
//		manager.getTransaction().commit();
		
		//find operation
//		Employee emp = manager.find(Employee.class, 1);
//		System.out.println(emp);
		
		//update operation
//		Employee emp = manager.find(Employee.class, 1);		//emp refers to a 'Managed' object 
//		manager.getTransaction().begin();
//		emp.setCity("Dubai");
//		emp.setSalary(32000.00);
//		manager.getTransaction().commit();
		
		//delete operation
//		Employee emp = manager.find(Employee.class, 1);		//emp refers to a 'Managed' object 
//		manager.getTransaction().begin();
//		manager.remove(emp);
//		manager.getTransaction().commit();
	}

}
