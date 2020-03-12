package com.dti.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dti.course.entities.OrderItem;
import com.dti.course.services.OrderItemService;

@RestController
@RequestMapping(value = "/orderItems")
public class OrderItemResource {

	@Autowired
	private OrderItemService orderItemService;
	
	@GetMapping
	public ResponseEntity<List<OrderItem>> findAll(){
		 List<OrderItem> orderItemsList = orderItemService.findAll() ;
		 return ResponseEntity.ok().body(orderItemsList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<OrderItem> findById(@PathVariable Long id){
		OrderItem orderItem = orderItemService.findById(id);
		return ResponseEntity.ok().body(orderItem);
	}
	
	

}
