package com.demo.bo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PropertySource("classpath:myproperties.properties")
public class Employee {
	
	@Value("${id}")
	private int id;
	
	@Value("${name}")
	private String name;
	private String city;
	private double salary;
	
	public Employee() {
		super();
		System.out.println("Employee object is created.. noarg constructor");
	}
	
	

	public Employee(int id, String name, String city, double salary) {
		super();
		System.out.println("Employee object is created.. paramaterized constructor");

		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("setting id for Employee");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setting name for Employee");

	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println("setting city for Employee");

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		System.out.println("setting salary for Employee");

	} 
	
	

}
