package com.educandoweb.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseSpring.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
	
}
