package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.dao.EmployeeDAO;

@Component
public class EmployeeService { //implements InitiazingBean, DisposableBean
	
	@Autowired
	private EmployeeDAO empDao;
	
	
	public EmployeeService() {
		System.out.println("EmployeeService object is created");

	}

	public EmployeeDAO getEmpDao() {
		return empDao;
	}

	
	public void setEmpDao(EmployeeDAO empDao) {
		this.empDao = empDao;
		System.out.println("initializing empdao");
	}

//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("this is init() method");
//	}
//
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("this is destroy() method");
//
//	}

//	@PostConstruct	
//	public void myOwnInitMethod() {
//		
//	}
	
//	@PreDestroy
//	public void destroy() {
//		
//	}

	
}
