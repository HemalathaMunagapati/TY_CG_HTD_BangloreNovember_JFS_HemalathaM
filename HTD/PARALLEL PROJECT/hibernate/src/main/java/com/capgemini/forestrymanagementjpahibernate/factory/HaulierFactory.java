package com.capgemini.forestrymanagementjpahibernate.factory;

import com.capgemini.forestrymanagementjpahibernate.dao.HaulierDao;
import com.capgemini.forestrymanagementjpahibernate.dao.HaulierDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.service.HaulierService;
import com.capgemini.forestrymanagementjpahibernate.service.HaulierServiceImpl;

public class HaulierFactory {

	public static HaulierDao instanceOfHaulierDaoImpl() {
		HaulierDao dao = new HaulierDaoImpl();
		return dao;

	}

	public static HaulierService instanceOfHaulierServices() {
		HaulierService services = new HaulierServiceImpl();
		return services;
	}

}
