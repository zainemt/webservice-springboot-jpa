package com.mnds.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mnds.demo.entities.Category;
import com.mnds.demo.services.CategoryService;

@RestController //anotação que denota que essa classe é um controlador rest
@RequestMapping(value = "/categories") //define o caminho de acesso aos recursos
public class CategoryResource {

	//classe contendo os recursos para a class Category
	@Autowired
	private CategoryService service;
	
	//end-point de retorno de usuários
	//ResponseEntity - tipo que define que o retorno do método será uma resposta de uma requisição web
	@GetMapping //define que esse método responde uma requisição do tipo get
	public ResponseEntity<List<Category>> findAll() {
		
		List<Category> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category Category = service.findById(id);
		return ResponseEntity.ok().body(Category);
	}
	
}
