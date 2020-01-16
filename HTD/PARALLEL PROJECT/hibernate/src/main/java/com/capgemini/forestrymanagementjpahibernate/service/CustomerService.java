package com.capgemini.forestrymanagementjpahibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementjpahibernate.dto.CustomerBean;

public interface CustomerService {
	public List<CustomerBean> getAllCustomers();

	public CustomerBean getCustomer(int customerId);

	public boolean insertCustomer(CustomerBean user);

	boolean deleteCustomer(int customerId);

	public boolean updateCustomer(int customerId, String customerName);
}
