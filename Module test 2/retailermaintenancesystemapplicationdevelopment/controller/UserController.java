package com.capgemini.retailermaintenancesystemapplicationdevelopment.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.UserInfoBean;
import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.UserResponse;
import com.capgemini.retailermaintenancesystemapplicationdevelopment.service.UserService;

@RestController // (controller + responsebody)
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping(path = "/auth", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse auth(@RequestBody UserInfoBean bean) {

		UserInfoBean userBean = service.auth(bean.getEmail(), bean.getPassword());
		UserResponse response = new UserResponse();
		if (userBean != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("User found for the credentials");
			response.setBeans(Arrays.asList(userBean));
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Credentials invalid");
		}
		return response;
	}

	@PostMapping(path = "/register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse register(@RequestBody UserInfoBean bean) {
		UserResponse response = new UserResponse();
		if (service.register(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("user registered");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Email already exists");
		}
		return response;

	}

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse searchEmployee(@RequestParam("key") String key) {
		UserResponse response = new UserResponse();
		List<UserInfoBean> beans = service.getAllUsers(key);
		if (beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not found");
		} else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("user data found");
			response.setBeans(beans);
		}
		return response;

	}

	@PutMapping(path = "/change-password", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse changePassword(@RequestBody UserInfoBean bean) {
		UserResponse response = new UserResponse();
		if (service.changePassword(bean.getId(), bean.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("password change succesfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("user not found/password not changed");
		}
		return response;
	}

	@DeleteMapping(path = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteEmployee(@PathVariable("id") int id) {
		UserResponse response = new UserResponse();

		service.deleteUser(id);
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDescription("User Details Deleted");
		return response;
	}

}
