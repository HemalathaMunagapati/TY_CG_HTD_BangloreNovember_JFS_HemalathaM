package com.capgemini.retailermaintenance.exception;

public class ProductsException extends RuntimeException {

	String msg;

	public ProductsException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}

}
