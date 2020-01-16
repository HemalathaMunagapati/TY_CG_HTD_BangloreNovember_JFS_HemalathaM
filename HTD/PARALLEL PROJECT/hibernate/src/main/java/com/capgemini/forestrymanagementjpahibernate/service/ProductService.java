package com.capgemini.forestrymanagementjpahibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementjpahibernate.dto.ProductBean;

public interface ProductService {
	public List<ProductBean> getAllProducts();

	public ProductBean getProduct(int productId);

	public boolean insertProduct(ProductBean user);

	boolean deleteProduct(int productId);

	public boolean updateProduct(int productId, String productName);

}
