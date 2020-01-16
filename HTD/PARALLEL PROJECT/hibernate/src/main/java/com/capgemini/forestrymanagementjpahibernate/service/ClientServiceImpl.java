package com.capgemini.forestrymanagementjpahibernate.service;

import com.capgemini.forestrymanagementjpahibernate.dao.ClientDao;
import com.capgemini.forestrymanagementjpahibernate.dao.ClientDaoImpl;

public class ClientServiceImpl implements ClientService {

	ClientDao dao = new ClientDaoImpl();

	public boolean login(String eMail, String password) {
		return dao.login(eMail, password);
	}

}
