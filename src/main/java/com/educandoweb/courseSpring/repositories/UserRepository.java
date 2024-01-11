package com.educandoweb.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseSpring.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}
