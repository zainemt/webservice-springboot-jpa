package com.mnds.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnds.demo.entities.Order;
import com.mnds.demo.repositories.OrderRepository;

@Service //registra a classe como componente do Spring, permitindo assim que ele realize a injeção de dependência implicita
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> order = repository.findById(id);
		return order.get();
	};
	
}
