package com.capgemini.forestrymanagementjpahibernate.factory;

import com.capgemini.forestrymanagementjpahibernate.dao.ContractDao;
import com.capgemini.forestrymanagementjpahibernate.dao.ContractDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.service.ContractService;
import com.capgemini.forestrymanagementjpahibernate.service.ContractServiceImpl;

public class ContractFactory {
	public static ContractDao instanceOfContractorDAOImpl() {
		ContractDao dao = new ContractDaoImpl();
		return dao;

	}

	public static ContractService instanceOfContractorServices() {
		ContractService services = new ContractServiceImpl();
		return services;
	}
}
