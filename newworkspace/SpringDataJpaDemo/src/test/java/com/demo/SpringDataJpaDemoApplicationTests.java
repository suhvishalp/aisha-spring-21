package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Employee;
import com.demo.services.EmployeeService;

@SpringBootTest
class SpringDataJpaDemoApplicationTests {
	
	@Autowired
	private EmployeeService employeeService;

	@Test
	void contextLoads() {
	}

	
	@Test
	public void testEmployeeSave() {
//		employeeService.save(emp);
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Vishal");
		emp.setCity("Mumbai");
		emp.setSalary(1000.00);
		
		employeeService.save(emp);
	}
}
