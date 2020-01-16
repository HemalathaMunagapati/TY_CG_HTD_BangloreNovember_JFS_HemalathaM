package com.capgemini.forestrymanagementjpahibernate.factory;

import com.capgemini.forestrymanagementjpahibernate.dao.AdminDao;
import com.capgemini.forestrymanagementjpahibernate.dao.AdminDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.dao.ClientDao;
import com.capgemini.forestrymanagementjpahibernate.dao.ClientDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.dao.SchedulerDao;
import com.capgemini.forestrymanagementjpahibernate.dao.SchedulerDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.service.AdminService;
import com.capgemini.forestrymanagementjpahibernate.service.AdminServiceImpl;
import com.capgemini.forestrymanagementjpahibernate.service.ClientService;
import com.capgemini.forestrymanagementjpahibernate.service.ClientServiceImpl;
import com.capgemini.forestrymanagementjpahibernate.service.SchedulerService;
import com.capgemini.forestrymanagementjpahibernate.service.SchedulerServiceImpl;

public class ForestFactory {
	public static AdminDao instanceOfAdminDaoImpl() {
		AdminDao dao = new AdminDaoImpl();
		return dao;
	}

	public static AdminService instanceOfAdminServiceImpl() {
		AdminService service = new AdminServiceImpl();
		return service;
	}

	public static ClientDao instanceOfClientDaoImpl() {
		ClientDao dao = new ClientDaoImpl();
		return dao;
	}

	public static ClientService instanceOfClientServiceImpl() {
		ClientService service = new ClientServiceImpl();
		return service;
	}

	public static SchedulerDao instanceOfSchedulerDaoImpl() {
		SchedulerDao dao = new SchedulerDaoImpl();
		return dao;
	}

	public static SchedulerService instanceOfSchedulerServiceImpl() {
		SchedulerService service = new SchedulerServiceImpl();
		return service;
	}

}
