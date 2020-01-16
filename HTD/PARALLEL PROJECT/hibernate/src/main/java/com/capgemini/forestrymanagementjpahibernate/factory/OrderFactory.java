package com.capgemini.forestrymanagementjpahibernate.factory;

import com.capgemini.forestrymanagementjpahibernate.dao.OrderDao;
import com.capgemini.forestrymanagementjpahibernate.dao.OrderDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.service.OrderServiceImpl;

public class OrderFactory {
	
	public static OrderDao instanceOfOrderDaoImpl() {
		OrderDao dao= new OrderDaoImpl();
		return dao;
		
	}
	public static OrderServiceImpl instanceOfOrderServices() {
		OrderServiceImpl services=new OrderServiceImpl();
		return services;
	}

}
