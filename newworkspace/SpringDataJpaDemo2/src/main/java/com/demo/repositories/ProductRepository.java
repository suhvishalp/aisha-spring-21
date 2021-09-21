package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{


	//custom query method - using @Query annotation & JPQL statement 
//	@Query(value = "SELECT p from Product p where p.price >= :price")
//	List<Product> getAllProducts(@Param("price") double price);

	
	//use the Query Generation Methods 
	Product findByName(String name);
	
	List<Product> findAllByPriceGreaterThan(double price);
	
}


//*Spring Data JPA Automatically creates a proxy instance of this interface (ProductRepository)