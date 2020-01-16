package com.capgemini.forestrymanagementjpahibernate.factory;

import com.capgemini.forestrymanagementjpahibernate.dao.ProductDao;
import com.capgemini.forestrymanagementjpahibernate.dao.ProductDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.service.ProductService;
import com.capgemini.forestrymanagementjpahibernate.service.ProductServiceImpl;

public class ProductFactory {
	private ProductFactory() {

	}

	public static ProductDao instanceOfProductDAOImpl() {
		ProductDao dao = new ProductDaoImpl();
		return dao;
	}

	public static ProductService instanceOfProductServices() {
		ProductService services = new ProductServiceImpl();
		return services;
	}
}
