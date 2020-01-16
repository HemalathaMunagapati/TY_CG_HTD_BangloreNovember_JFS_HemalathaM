package com.capgemini.forestrymanagementjpahibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementjpahibernate.dao.OrderDao;
import com.capgemini.forestrymanagementjpahibernate.dao.OrderDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.dto.OrderBean;

public class OrderServiceImpl implements OrderService {
	OrderDao dao = new OrderDaoImpl();

	public List<OrderBean> getAllOrders() {
		return dao.getAllOrders();
	}

	public OrderBean getOrder(int orderNo) {
		return dao.getOrder(orderNo);
	}

	public boolean insertOrder(OrderBean user) {
		return dao.insertOrder(user);
	}

	public boolean deleteOrder(int orderNo) {
		return dao.deleteOrder(orderNo);
	}

	public boolean updateOrder(int orderNo, String deliveryDay) {
		return dao.updateOrder(orderNo, deliveryDay);
	}

}
