package com.educandoweb.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseSpring.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
