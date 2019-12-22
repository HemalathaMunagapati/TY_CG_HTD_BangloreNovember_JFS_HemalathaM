package com.caps.shoppingapp.services;

import java.util.List;

import com.caps.shoppingapp.bean.ProductBean;
import com.caps.shoppingapp.dao.ProductDao;
import com.caps.shoppingapp.factory.ProductFactory;

public class ProductServicesImpl implements ProductServices{
	ProductDao dao=ProductFactory.instanceOfProductDaoImpl();

	@Override
	public List<ProductBean> getAllProductscts() {
		return dao.getAllProductscts();
	}

	@Override
	public ProductBean getProduct(String productName) {
		return dao.getProduct(productName);
	}

}
