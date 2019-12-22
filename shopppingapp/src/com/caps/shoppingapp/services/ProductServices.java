package com.caps.shoppingapp.services;

import java.util.List;

import com.caps.shoppingapp.bean.ProductBean;

public interface ProductServices {
	public  List<ProductBean> getAllProductscts();
	public  ProductBean getProduct(String productName);

}
