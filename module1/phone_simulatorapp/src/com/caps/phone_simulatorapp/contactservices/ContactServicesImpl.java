package com.caps.phone_simulatorapp.contactservices;

import java.util.List;

import com.caps.phone_simulatorapp.contactbean.ContactBean;
import com.caps.phone_simulatorapp.contactdao.ContactDAO;
import com.caps.phone_simulatorapp.factory.ContactFactory;

public class ContactServicesImpl implements ContactServices{
	ContactDAO dao=ContactFactory.instanceOfContactDAOImpl();

	@Override
	public List<ContactBean> getAllContacts() {
		
		return dao.getAllContacts();
	}

	
	@Override
	public boolean deleteContact(String contactname) {
		return dao.deleteContact(contactname);
	}

	@Override
	public boolean editContact(String contactname) {
		return dao.editContact(contactname);
	}


	@Override
	public boolean addContact(ContactBean contactname) {
		
		return dao.addContact(contactname);
	}

}
