package com.capgemini.forestrymanagementjpahibernate.service;

import com.capgemini.forestrymanagementjpahibernate.dao.SchedulerDao;
import com.capgemini.forestrymanagementjpahibernate.dao.SchedulerDaoImpl;

public class SchedulerServiceImpl implements SchedulerService {

	SchedulerDao dao = new SchedulerDaoImpl();

	public boolean login(String eMail, String password) {
		return dao.login(eMail, password);
	}

}
