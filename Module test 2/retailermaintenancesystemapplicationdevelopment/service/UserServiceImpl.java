package com.capgemini.retailermaintenancesystemapplicationdevelopment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenancesystemapplicationdevelopment.dao.UserDAO;
import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.OrderInfoBean;
import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.UserInfoBean;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO dao;

	@Override
	public UserInfoBean auth(String email, String password) {
		return dao.auth(email, password);
	}

	@Override
	public boolean register(UserInfoBean bean) {
		//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		//String encodedPassword = encoder.encode(bean.getPassword());
		//bean.setPassword(encodedPassword);

		List<OrderInfoBean> orderBeans = bean.getOrderBeans();
		for (OrderInfoBean orderInfoBeans : orderBeans) {
			orderInfoBeans.setBean(bean);

		}
		return dao.register(bean);
	}

	@Override
	public List<UserInfoBean> getAllUsers(String key) {
		return dao.getAllUsers(key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		return false;
		//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		//return dao.changePassword(id, encoder.encode(password));
	}

	@Override
	public boolean deleteUser(int id) {
		return dao.deleteUser(id);
	}

}
