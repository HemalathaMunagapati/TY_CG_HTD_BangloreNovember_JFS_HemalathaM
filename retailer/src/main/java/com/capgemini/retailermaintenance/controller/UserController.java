package com.capgemini.retailermaintenance.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintenance.dto.UserInfo;
import com.capgemini.retailermaintenance.dto.UserResponse;
import com.capgemini.retailermaintenance.service.ProductService;

@RestController
public class UserController {

	@Autowired
	ProductService service;

//	@PostMapping(path = "/add-user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public UserResponse addProduct(@RequestBody UserInfo user) {
//		UserResponse response = new UserResponse();
//		if (service.addUser(user)) {
//			response.setStatusCode(201);
//			response.setMessage("Success");
//			response.setDescription("User added");
//		} else {
//			response.setStatusCode(401);
//			response.setMessage("Failure");
//			response.setDescription("User with same id already exists");
//		}
//		return response;
//	}

	@PostMapping(path = "/user-register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse register(@RequestBody UserInfo account) {
		UserResponse response = new UserResponse();
		service.register(account);
		response.setStatusCode(201);
		response.setDescription("Success");
		response.setMessage("Account created");
		return response;
	}

	@PostMapping(path = "/users-login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse login(@RequestBody UserInfo credentials) {
		UserResponse response = new UserResponse();
		UserInfo account = service.login(credentials);
		if (account != null) {
			response.setStatusCode(201);
			response.setDescription("Success");
			response.setMessage(" you are successfully Logged in");
			response.setAccount(Arrays.asList(account));
		} else {
			response.setStatusCode(405);
			response.setDescription("Failure to login");
			response.setMessage("Provide valid credentials");
		}
		return response;
	}

	@PutMapping(path = "/change-password", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse changePassword(@RequestBody UserInfo user) {
		UserResponse response = new UserResponse();
		if (service.changePassword(user.getId(), user.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("password  updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("id not found");
		}
		return response;
	}

}
