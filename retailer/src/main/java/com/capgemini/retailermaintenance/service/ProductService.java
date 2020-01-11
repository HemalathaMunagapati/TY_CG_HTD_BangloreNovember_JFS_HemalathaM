package com.capgemini.retailermaintenance.service;

import com.capgemini.retailermaintenance.dto.OrderInfo;
import com.capgemini.retailermaintenance.dto.ProductInfo;
import com.capgemini.retailermaintenance.dto.UserInfo;

public interface ProductService {

	public OrderInfo getOrders(int id);

	public boolean register(UserInfo account);

	public UserInfo login(UserInfo credentials);

	public ProductInfo getProducts(int id);

	public boolean changePassword(int id, String password);
	
	public boolean addProduct(ProductInfo product);

	public boolean addOrder(OrderInfo order);

	public boolean addUser(UserInfo user);

}
