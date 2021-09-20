package com.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.demo.entities.Employee;

@Repository
public class EmployeeDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Employee save(Employee emp) {
		//code to persist emp object into db if it new 
			//otherwise update existing emp
		
		return null;
	}
	
	public Employee find(int id) {
		//code to find emp 
		
		return null;
	}
	
	public List<Employee> getAllEmployees(){
		//code to find all emp
		
		return null;
	}
	
	public Employee remove(int id) {
		//code to remove emp 
		
		return null;
	}
}
