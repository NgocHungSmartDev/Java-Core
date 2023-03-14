package com.ngochung.java8.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ApiException extends RuntimeException {

	private HttpStatus httpStatus;

	public ApiException(String errorMessage, HttpStatus notFound) {
		super(errorMessage);
		this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
	}
	
	
}
