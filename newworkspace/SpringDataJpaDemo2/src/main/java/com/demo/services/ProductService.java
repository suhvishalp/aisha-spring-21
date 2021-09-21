package com.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Product;
import com.demo.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	public Product getProduct(int id) {
		Optional<Product> optProduct =  productRepository.findById(id);
		
		if(optProduct.isPresent()) {
			return optProduct.get();
		}
		
		return null;
	}

	public Product update(Product product) {
		Product prod = getProduct(product.getId());
		
		if(prod!=null) {
			prod.setName(product.getName());
			prod.setPrice(product.getPrice());
			prod.setDescription(product.getDescription());
			return prod;
		}
		
		return null;
	}
	
	public Product delete(int id) {
		Product prod = getProduct(id);
		
		if(prod!=null) {
			productRepository.delete(prod);
			return prod;
		}
		
		return null;
	}
}
