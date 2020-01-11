package com.capgemini.retailermaintenance.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintenance.dto.OrderInfo;
import com.capgemini.retailermaintenance.dto.OrderResponse;
import com.capgemini.retailermaintenance.service.ProductService;

@RestController
public class OrderController {

	@Autowired
	ProductService service;

	@PostMapping(path = "/add-order", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse addProduct(@RequestBody OrderInfo order) {
		OrderResponse response = new OrderResponse();
		if (service.addOrder(order)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product with same name already exists");
		}
		return response;
	}

	@GetMapping(path = "/view-order", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse viewOrder(@RequestParam("id") int id) {
		OrderResponse response = new OrderResponse();
		OrderInfo order = service.getOrders(id);
		if (order != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setOrder(Arrays.asList(order));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product id does not exist");
		}
		return response;
	}

}
