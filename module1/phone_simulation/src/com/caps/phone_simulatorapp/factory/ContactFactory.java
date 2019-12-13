package com.caps.phone_simulatorapp.factory;
import com.caps.phone_simulatorapp.contactdao.ContactDAO;
import com.caps.phone_simulatorapp.contactdao.ContactDAOImpl;
import com.caps.phone_simulatorapp.contactservices.ContactServices;
import com.caps.phone_simulatorapp.contactservices.ContactServicesImpl;

public class ContactFactory {
private ContactFactory() {
		
	}
   public static ContactDAO instanceOfContactDAOImpl() {
	ContactDAO dao= new ContactDAOImpl();
	return dao;
   }
   public static ContactServices instanceOfContactServices() {
		ContactServices services=new ContactServicesImpl();
		return services;
	}

}
