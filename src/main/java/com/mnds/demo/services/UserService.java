package com.mnds.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnds.demo.entities.User;
import com.mnds.demo.repositories.UserRepository;

@Service //registra a classe como componente do Spring, permitindo assim que ele realize a injeção de dependência implicita
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = repository.findById(id);
		return user.get();
	}

	public User insert(User user) {
		return repository.save(user);
	}
}
