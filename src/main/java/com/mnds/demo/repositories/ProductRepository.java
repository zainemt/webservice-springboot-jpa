package com.mnds.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mnds.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
