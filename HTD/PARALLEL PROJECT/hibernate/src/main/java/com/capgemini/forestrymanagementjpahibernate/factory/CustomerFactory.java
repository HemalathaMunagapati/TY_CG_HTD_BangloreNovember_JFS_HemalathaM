package com.capgemini.forestrymanagementjpahibernate.factory;

import com.capgemini.forestrymanagementjpahibernate.dao.CustomerDao;
import com.capgemini.forestrymanagementjpahibernate.dao.CustomerDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.service.CustomerService;
import com.capgemini.forestrymanagementjpahibernate.service.CustomerServiceImpl;

public class CustomerFactory {
	private CustomerFactory() {

	}

	public static CustomerDao instanceOfCustomerDAOImpl() {
		CustomerDao dao = new CustomerDaoImpl();
		return dao;
	}

	public static CustomerService instanceOfCustomerServices() {
		CustomerService services = new CustomerServiceImpl();
		return services;
	}

}
