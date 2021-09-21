package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Customer;
import com.demo.entities.PhoneNumber;
import com.demo.repositories.CustomerRepository;

@SpringBootTest
class SpringDataJpaRelationshipDemo1ApplicationTests {
	
	@Autowired
	private CustomerRepository custRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("vishal");
		
		List<PhoneNumber> list = new ArrayList<>();
		PhoneNumber ph1 = new PhoneNumber();
		ph1.setNumber("9850810100");
		ph1.setType("mobile");
		
		PhoneNumber ph2 = new PhoneNumber();
		ph2.setNumber("9853310100");
		ph2.setType("mobile");
		
		list.add(ph1);
		list.add(ph2);
		
		customer.setPhoneNumbers(list);
		
		custRepo.save(customer);
	}
	
	@Test
	@Transactional
	public void testCustomerLoad() {
		Optional<Customer> optCustomer =  custRepo.findById(1);
		
		if(optCustomer.isPresent()) {
			Customer c = optCustomer.get();
			System.out.println("Customer name = " + c.getName());
			System.out.println("phone = " + c.getPhoneNumbers());
		}
		
	}
	
}
