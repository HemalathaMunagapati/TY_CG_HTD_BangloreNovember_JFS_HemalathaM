package com.caps.shoppingapp.dao;

import java.util.List;

import com.caps.shoppingapp.bean.ProductBean;


public interface ProductDao {
	public  List<ProductBean> getAllProductscts();
	public  ProductBean getProduct(String productName);

}
