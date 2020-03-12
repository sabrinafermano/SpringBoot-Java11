package com.dti.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dti.course.entities.OrderItem;
import com.dti.course.repositories.OrderItemRepository;

@Component
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public List<OrderItem> findAll(){
		return orderItemRepository.findAll();
	}
	
	public OrderItem findById(Long id) {
		Optional<OrderItem> orderItem = orderItemRepository.findById(id);
		return orderItem.get();
	}
}
