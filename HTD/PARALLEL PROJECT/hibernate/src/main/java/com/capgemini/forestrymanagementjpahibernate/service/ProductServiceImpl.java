package com.capgemini.forestrymanagementjpahibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementjpahibernate.dao.ProductDao;
import com.capgemini.forestrymanagementjpahibernate.dao.ProductDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.dto.ProductBean;

public class ProductServiceImpl implements ProductService{
ProductDao dao=new ProductDaoImpl();
	public List<ProductBean> getAllProducts() {
		return dao.getAllProducts();
	}

	public ProductBean getProduct(int productId) {
		return dao.getProduct(productId);
	}

	public boolean insertProduct(ProductBean user) {
		return dao.insertProduct(user);
	}

	public boolean deleteProduct(int productId) {
		return dao.deleteProduct(productId);
	}

	public boolean updateProduct(int productId, String productName) {
		return dao.updateProduct(productId, productName);
	}

}
