package com.caps.shoppingapp.factory;

import com.caps.shoppingapp.dao.ProductDao;
import com.caps.shoppingapp.dao.ProductDaoImpl;
import com.caps.shoppingapp.services.ProductServices;
import com.caps.shoppingapp.services.ProductServicesImpl;

public class ProductFactory {
	private ProductFactory() {

	}
	public static ProductDao instanceOfProductDaoImpl() {
		ProductDao dao= new ProductDaoImpl();
		return dao;
	}
	public static ProductServices instanceOfProductServices() {
		ProductServices services=new ProductServicesImpl();
		return services;
	}


}
