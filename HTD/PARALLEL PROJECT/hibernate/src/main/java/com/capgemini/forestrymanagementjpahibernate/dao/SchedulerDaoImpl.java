package com.capgemini.forestrymanagementjpahibernate.dao;

public class SchedulerDaoImpl implements SchedulerDao {

	public boolean login(String eMail, String password) {
		if (eMail.equals("Shiva@gmail.com") && password.equals("Shiva@123")) {
			return true;
		} else
			return false;
	}

}
