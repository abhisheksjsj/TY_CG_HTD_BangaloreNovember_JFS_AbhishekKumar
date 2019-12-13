package com.capgemini.psad.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.psad.bean.ContactBean;
import com.capgemini.psad.dao.ContactDAO;
import com.capgemmini.psad.factory.ContactFactory;

public class ContactController {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ContactBean contact = new ContactBean();
		ContactDAO dao = ContactFactory.instanceOfContactDAOImpl();

		System.out.println("Enter 1 to show all Contacts");
		System.out.println("Enter 2 to search the Contact");
		System.out.println("Enter 3 Operate on Contact");

		int a1 = sc.nextInt();
		switch (a1) {
		case 1:
			List<ContactBean> list = dao.getAllContacts();
			if (list != null) {
				for (ContactBean contactBean : list) {
					System.out.println(contact);
				}
			}
			break;
			
		case 2:
			System.out.println("Press 1 to Call");
			System.out.println("Press 2 to message");
			System.out.println("Press 3 to go back to main menu");

			int b1 = sc.nextInt();
			switch (b1) {
			case 1:
				System.out.println("Press 1 to call");
				int call = sc.nextInt();
				System.out.println("Calling");
				System.out.println("Press 2 to end");
				int end = sc.nextInt();
				System.out.println("Call end");
				break;

			case 2:
				System.out.println("Give the message");
				String msg = sc.nextLine();
				System.out.println("Message is Sent");
				break;

			default:
				break;
			}

		case 3:
			System.out.println("Press 1 to Add Contact");
			System.out.println("Press 2 to Delete a Contact");
			System.out.println("Press 3 to Update Contact");

			int b2 = sc.nextInt();
			switch (b2) {
			case 1:
				System.out.println("Enter name");
				contact.setName(sc.next());
				System.out.println("Enter number");
				contact.setNumber(sc.nextInt());
				System.out.println("Enter group");
				contact.setGroup(sc.next());

				if (dao.addContact(contact)) {
					System.out.println("Contact is inserted Successfully");
				}
				break;

			case 2:
				if (dao.deleteContact(contact.getName())) {
					System.out.println("Contact is Deleted Successfully");
				}
				break;

			case 3:
				if (dao.updateContact(contact.getName())) {
					System.out.println("Enter name");
					contact.setName(sc.next());
					System.out.println("Enter number");
					contact.setNumber(sc.nextInt());
					System.out.println("Enter Group");
					contact.setGroup(sc.next());
				}
				break;

			default:
				break;
			}

		default:
			break;
		}
	}// end of main method

}// end of main class
