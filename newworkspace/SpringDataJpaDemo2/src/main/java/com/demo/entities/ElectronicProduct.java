package com.demo.entities;

import javax.persistence.Entity;

@Entity
public class ElectronicProduct extends Product {

	private String type;

	
	private String make;
	private String model;
	
	public ElectronicProduct() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
