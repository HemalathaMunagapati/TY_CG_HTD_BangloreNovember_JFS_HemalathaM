package com.capgemini.forestrymanagementjpahibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementjpahibernate.dto.OrderBean;

public interface OrderService {

	public List<OrderBean> getAllOrders();

	public OrderBean getOrder(int orderNo);

	public boolean insertOrder(OrderBean user);

	boolean deleteOrder(int orderNo);

	public boolean updateOrder(int orderNo, String deliveryDay);

}
