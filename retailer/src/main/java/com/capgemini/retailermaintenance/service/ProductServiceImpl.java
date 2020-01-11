package com.capgemini.retailermaintenance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenance.dao.ProductDao;
import com.capgemini.retailermaintenance.dto.OrderInfo;
import com.capgemini.retailermaintenance.dto.ProductInfo;
import com.capgemini.retailermaintenance.dto.UserInfo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;

	@Override
	public OrderInfo getOrders(int id) {
		return dao.getOrders(id);
	}

	@Override
	public boolean register(UserInfo account) {
		return dao.register(account);
	}

	@Override
	public UserInfo login(UserInfo credentials) {
		return dao.login(credentials);
	}

	@Override
	public ProductInfo getProducts(int id) {
		return dao.getProducts(id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		return dao.changePassword(id, password);
	}

	@Override
	public boolean addProduct(ProductInfo product) {
		return dao.addProduct(product);
	}

	@Override
	public boolean addOrder(OrderInfo order) {
		return dao.addOrder(order);
	}

	@Override
	public boolean addUser(UserInfo user) {
		return dao.addUser(user);
	}

}
