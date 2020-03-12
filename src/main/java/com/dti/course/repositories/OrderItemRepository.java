package com.dti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dti.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
