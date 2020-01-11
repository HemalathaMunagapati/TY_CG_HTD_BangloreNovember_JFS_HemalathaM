package com.capgemini.retailermaintenance.dao;

import com.capgemini.retailermaintenance.dto.OrderInfo;
import com.capgemini.retailermaintenance.dto.ProductInfo;
import com.capgemini.retailermaintenance.dto.UserInfo;

public interface ProductDao {
//order dao
	public OrderInfo getOrders(int id);

	public boolean addOrder(OrderInfo order);

//product dao 
	public ProductInfo getProducts(int id);

	public boolean addProduct(ProductInfo product);

//user dao
	public boolean addUser(UserInfo user);

	public boolean register(UserInfo account);

	public UserInfo login(UserInfo credentials);

	public boolean changePassword(int id, String password);

}
