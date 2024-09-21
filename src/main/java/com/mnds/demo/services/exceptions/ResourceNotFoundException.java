package com.mnds.demo.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) { //recebe o id de um objeto
		super("Resource not found. Id " + id);
	}
	
}
