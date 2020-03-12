package com.dti.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dti.course.entities.Product;
import com.dti.course.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService ProductService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		 List<Product> ProductsList = ProductService.findAll() ;
		 return ResponseEntity.ok().body(ProductsList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product product = ProductService.findById(id);
		return ResponseEntity.ok().body(product);
	}
	
	

}
