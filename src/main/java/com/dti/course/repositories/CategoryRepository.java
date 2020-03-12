package com.dti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dti.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
