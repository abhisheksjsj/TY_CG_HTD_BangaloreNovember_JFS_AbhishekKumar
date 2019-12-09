package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UpdateUser {
	public static void main(String[] args) {
		UserServices services = UserFactory.instanceOfUserServices();
		UserBean user = new UserBean();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Userid..");
		user.setUserid(sc.nextInt());
		System.out.println("Enter password");
		user.setPassword(sc.next());
		System.out.println("Enter Email");
		user.setEmail(sc.next());
		System.out.println("-----------");

		if (services.updateUser(user.getUserid(), user.getPassword(), user.getEmail())) {
			System.out.println("User Updated...");

		} else {
			System.err.println("Something went wrong");
		}
		sc.close();

	}
}
