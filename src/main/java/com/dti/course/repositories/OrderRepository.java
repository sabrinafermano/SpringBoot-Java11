package com.dti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dti.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
