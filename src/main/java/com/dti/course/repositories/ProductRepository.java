package com.dti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dti.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
