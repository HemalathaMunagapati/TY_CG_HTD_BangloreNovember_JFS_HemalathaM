package com.capgemini.retailermaintenance.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailermaintenance.dto.UserResponse;
import com.capgemini.retailermaintenance.exception.ProductsException;

@RestControllerAdvice
public class UserControllerAdvice {

	@ExceptionHandler(ProductsException.class)
	public UserResponse authException(ProductsException e) {
		UserResponse response = new UserResponse();
		response.setStatusCode(501);
		response.setDescription("Exception");
		response.setMessage(e.getMessage());
		return response;
	}

}
