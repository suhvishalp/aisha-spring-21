package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDAO;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	
	
}
