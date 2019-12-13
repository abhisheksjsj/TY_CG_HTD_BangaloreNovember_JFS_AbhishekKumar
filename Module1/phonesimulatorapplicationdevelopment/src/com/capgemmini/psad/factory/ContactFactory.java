package com.capgemmini.psad.factory;

import com.capgemini.psad.dao.ContactDAO;
import com.capgemini.psad.dao.ContactDAOImpl;

public class ContactFactory {

	public static ContactDAO instanceOfContactDAOImpl() {
		ContactDAO cdao = new ContactDAOImpl();
		return cdao;
	}

}
