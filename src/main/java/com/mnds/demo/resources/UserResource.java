package com.mnds.demo.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mnds.demo.entities.User;
import com.mnds.demo.services.UserService;

@RestController //anotação que denota que essa classe é um controlador rest
@RequestMapping(value = "/users") //define o caminho de acesso aos recursos
public class UserResource {

	//classe contendo os recursos para a class User
	@Autowired
	private UserService service;
	
	//end-point de retorno de usuários
	//ResponseEntity - tipo que define que o retorno do método será uma resposta de uma requisição web
	@GetMapping //define que esse método responde uma requisição do tipo get
	public ResponseEntity<List<User>> findAll() {
		
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User user = service.findById(id);
		return ResponseEntity.ok().body(user);
	}

	//inserir um usuário no banco de dados
	
	@PostMapping
	public ResponseEntity<User> insert(@RequestBody User user) { //fará a deserialização do objeto recebido
		user = service.insert(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).body(user);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build(); //.noContent retorna uma resposta vazia no código http 204
	}
	
}
