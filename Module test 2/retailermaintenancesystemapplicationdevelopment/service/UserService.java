package com.capgemini.retailermaintenancesystemapplicationdevelopment.service;

import java.util.List;

import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.UserInfoBean;

public interface UserService {
	public UserInfoBean auth(String email, String password);

	public boolean register(UserInfoBean bean);

	public List<UserInfoBean> getAllUsers(String key);

	public boolean changePassword(int id, String password);

	public boolean deleteUser(int id);

}
