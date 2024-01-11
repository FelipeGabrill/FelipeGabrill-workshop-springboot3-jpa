package com.educandoweb.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseSpring.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
	
}
