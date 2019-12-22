package com.caps.shoppingapp.productmain;

import java.util.List;

import com.caps.shoppingapp.bean.ProductBean;
import com.caps.shoppingapp.factory.ProductFactory;
import com.caps.shoppingapp.services.ProductServices;


public class ProductList {
	public void list() {
		ProductServices services1=ProductFactory.instanceOfProductServices();
		List<ProductBean> list=services1.getAllProductscts();
		if(list!=null) {
			for (ProductBean user : list) {
				System.out.println(user);
			}
		}
		else {
			System.out.println("product details not found....!!!");
		}
	}
}
