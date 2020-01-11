package com.capgemini.retailermaintenancesystemapplicationdevelopment.service;

import java.util.List;

import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.OrderInfoBean;

public interface OrderService {
	
	public boolean registerOrder(OrderInfoBean bean);

	public List<OrderInfoBean> getAllOrders(String key);

	public boolean deleteOrder(int id);

}
