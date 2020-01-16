package com.capgemini.forestrymanagementjpahibernate.service;

import com.capgemini.forestrymanagementjpahibernate.dao.AdminDao;
import com.capgemini.forestrymanagementjpahibernate.dao.AdminDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.dto.AdminBean;

public class AdminServiceImpl implements AdminService {
	AdminDao dao = new AdminDaoImpl();

	public boolean signup(String eMail, String password) {
		return dao.signup(eMail, password);
	}

	public boolean login(String eMail, String password) {
		return dao.login(eMail, password);
	}

	public boolean addClient(String email, AdminBean bean) {
		return dao.addClient(email, bean);
	}

	public boolean addScheduler(String email, AdminBean bean) {
		return dao.addScheduler(email, bean);
	}

	public boolean deleteClient(String email) {
		return dao.deleteClient(email);
	}

	public boolean deleteScheduler(String email) {
		return dao.deleteScheduler(email);
	}

}
