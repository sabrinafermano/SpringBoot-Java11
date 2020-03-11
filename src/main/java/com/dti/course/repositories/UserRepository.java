package com.dti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dti.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
