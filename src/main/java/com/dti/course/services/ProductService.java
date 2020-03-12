package com.dti.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dti.course.entities.Product;
import com.dti.course.repositories.ProductRepository;

@Component
public class ProductService {
	
	@Autowired
	private ProductRepository ProductRepository;
	
	public List<Product> findAll(){
		return ProductRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> product = ProductRepository.findById(id);
		return product.get();
	}
}
