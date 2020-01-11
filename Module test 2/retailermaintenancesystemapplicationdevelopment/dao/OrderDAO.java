package com.capgemini.retailermaintenancesystemapplicationdevelopment.dao;

import java.util.List;

import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.OrderInfoBean;

public interface OrderDAO {

	public boolean registerOrder(OrderInfoBean bean);

	public List<OrderInfoBean> getAllOrders(String key);

	public boolean deleteOrder(int id);

}
