package com.mnds.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mnds.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
