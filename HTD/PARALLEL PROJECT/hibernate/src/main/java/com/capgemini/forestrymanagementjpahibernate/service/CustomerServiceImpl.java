package com.capgemini.forestrymanagementjpahibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementjpahibernate.dao.CustomerDao;
import com.capgemini.forestrymanagementjpahibernate.dao.CustomerDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.dto.CustomerBean;

public class CustomerServiceImpl implements CustomerService {
	CustomerDao dao = new CustomerDaoImpl();

	public List<CustomerBean> getAllCustomers() {
		return dao.getAllCustomers();
	}

	public CustomerBean getCustomer(int customerId) {
		return dao.getCustomer(customerId);
	}

	public boolean insertCustomer(CustomerBean user) {
		return dao.insertCustomer(user);
	}

	public boolean deleteCustomer(int customerId) {
		return dao.deleteCustomer(customerId);
	}

	public boolean updateCustomer(int customerId, String customerName) {
		return dao.updateCustomer(customerId, customerName);
	}

}
