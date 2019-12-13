package com.caps.phone_simulatorapp.contactservices;

import java.util.List;

import com.caps.phone_simulatorapp.contactbean.ContactBean;

public interface ContactServices {
	public abstract List<ContactBean> getAllContacts();
	public abstract boolean addContact(ContactBean contactname);
	public abstract boolean deleteContact(String contactname);
	public abstract boolean editContact(String contactname);


}
