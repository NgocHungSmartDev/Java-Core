package com.ngochung.java8.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends ApiException {

	public ResourceNotFoundException(String errorMessage) {
		super(errorMessage, HttpStatus.NOT_FOUND);
	}
	
	public static ResourceNotFoundException userNotFound() {
		return new ResourceNotFoundException("user");
	}
	
	public static ResourceNotFoundException roleNotFound() {
		return new ResourceNotFoundException("role");
	}

}
