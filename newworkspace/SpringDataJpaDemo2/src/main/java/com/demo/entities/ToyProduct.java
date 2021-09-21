package com.demo.entities;

import javax.persistence.Entity;

@Entity
public class ToyProduct extends Product {

	private int age;
	

	public ToyProduct() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
