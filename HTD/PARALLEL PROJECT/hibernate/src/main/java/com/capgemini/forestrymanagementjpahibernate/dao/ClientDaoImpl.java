package com.capgemini.forestrymanagementjpahibernate.dao;

public class ClientDaoImpl implements ClientDao {

	public boolean login(String eMail, String password) {
		if (eMail.equals("manju123@gmail.com") && password.equals("Manju@123")) {
			return true;
		} else
			return false;
	}

}
