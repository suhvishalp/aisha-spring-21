package com.demo;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Product;
import com.demo.repositories.ProductRepository;
import com.demo.services.ProductService;

@SpringBootTest
class SpringDataJpaDemo2ApplicationTests {
	
	@Autowired
	private ProductService prodService;
	
	@Autowired
	private ProductRepository prodRepo;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testGetAllProducts() {
		
//	   Iterable<Product> list = prodRepo.findAll();
//	   System.out.println(list);
		
//	  List<Product> list =	prodRepo.getAllProducts(3000.00);
//	  System.out.println(list);
		
		 List<Product> list =	prodRepo.findAllByPriceGreaterThan(3000.00);
		  System.out.println(list);
		
	}
	
	
//	@Test
//	public void testProdRepo() {
//		
//	   Optional<Product> optprod =	prodRepo.findById(1);
//	   
//	   if (optprod.isPresent())
//		   System.out.println(optprod.get());
//
//	}

//	@Test
//	public void testProductSave() {
//		Product prod = new Product();
//		prod.setName("P1");
//		prod.setDescription("Some description for P1");
//		prod.setPrice(100.00);
//		
//		prodService.save(prod);
//	}
//	
//	@Test
//	public void testProductDelete() {
//		prodService.delete(1);
//	}
	
//	@Test
//	public void testProductList() {
//		Product prod = prodService.getProduct(1);
//		System.out.println(prod);
//	}
	
}
