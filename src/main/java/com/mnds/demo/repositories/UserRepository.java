package com.mnds.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mnds.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	//somente com a implementação da interface extendendo o jpa repository, automaticamente já é implementada a interface com o spring data jpa

}
