package com.dti.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dti.course.entities.User;

@RestController
@RequestMapping(value = "/users")

public class UserResource {

	public UserResource() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		 User user = new User(1L, "Sabrina", "sabrina@dti.com", "31999999999", "PassWord");
		 return ResponseEntity.ok().body(user);
	}
	
	

}
