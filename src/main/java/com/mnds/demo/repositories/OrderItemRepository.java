package com.mnds.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mnds.demo.entities.OrderItem;
import com.mnds.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
	//somente com a implementação da interface extendendo o jpa repository, automaticamente já é implementada a interface com o spring data jpa

}
