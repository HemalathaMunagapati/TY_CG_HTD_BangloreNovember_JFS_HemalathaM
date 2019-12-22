package com.caps.shoppingapp.bean;

import lombok.Data;

@Data
public class ProductBean {
private int productId;
private String productName;
private double ProductCost;
private String prouductColor;
private String description;
private int numberOfProducts;
@Override
public String toString() {
	return " [productId=" + productId + ", productName=" + productName + ", ProductCost=" + ProductCost
			+ ", prouductColor=" + prouductColor + ", description=" + description + ", numberOfProducts="
			+ numberOfProducts + "]";
}

}
