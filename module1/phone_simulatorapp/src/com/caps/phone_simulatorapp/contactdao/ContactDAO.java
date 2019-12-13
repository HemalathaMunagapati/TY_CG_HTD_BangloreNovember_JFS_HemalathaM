package com.caps.phone_simulatorapp.contactdao;

import java.util.List;

import com.caps.phone_simulatorapp.contactbean.ContactBean;

public interface ContactDAO {
public abstract List<ContactBean> getAllContacts();
public abstract boolean addContact(ContactBean contactname);
public abstract boolean deleteContact(String contactname);
public abstract boolean editContact(String contactname);
}
