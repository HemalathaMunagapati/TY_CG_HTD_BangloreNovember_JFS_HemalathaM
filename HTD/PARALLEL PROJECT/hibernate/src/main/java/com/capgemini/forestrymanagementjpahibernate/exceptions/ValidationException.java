package com.capgemini.forestrymanagementjpahibernate.exceptions;

@SuppressWarnings("serial")
public class ValidationException extends RuntimeException {
	public String getMessage() {
		return "Id repeated Exception";
	}

}
