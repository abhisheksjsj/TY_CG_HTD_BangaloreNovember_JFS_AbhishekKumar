package com.capgemini.retailermaintenancesystemapplicationdevelopment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenancesystemapplicationdevelopment.dao.OrderDAO;
import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.OrderInfoBean;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDAO dao;


	@Override
	public boolean registerOrder(OrderInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OrderInfoBean> getAllOrders(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteOrder(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
