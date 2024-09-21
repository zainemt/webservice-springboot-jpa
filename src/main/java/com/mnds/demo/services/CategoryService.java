package com.mnds.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnds.demo.entities.Category;
import com.mnds.demo.repositories.CategoryRepository;

@Service //registra a classe como componente do Spring, permitindo assim que ele realize a injeção de dependência implicita
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> Category = repository.findById(id);
		return Category.get();
	};
	
}
