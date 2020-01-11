package com.capgemini.retailermaintenancesystemapplicationdevelopment.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailermaintenancesystemapplicationdevelopment.dto.UserResponse;
import com.capgemini.retailermaintenancesystemapplicationdevelopment.exception.UserException;

@RestControllerAdvice
public class UserControllerAdvice {
	@ExceptionHandler(UserException.class)
	public UserResponse handleEmployeeException(UserException e) {
		UserResponse response = new UserResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}

}
