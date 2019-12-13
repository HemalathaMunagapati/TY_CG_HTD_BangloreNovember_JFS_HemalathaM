package com.caps.phone_simulation.contact_list;

import java.util.List;
import java.util.Scanner;

import com.caps.phone_simulatorapp.contactbean.ContactBean;
import com.caps.phone_simulatorapp.contactdao.ContactDAO;
import com.caps.phone_simulatorapp.contactservices.ContactServices;
import com.caps.phone_simulatorapp.factory.ContactFactory;

public class Contact_List {
	

	

		public void list() {
			ContactServices services1=ContactFactory.instanceOfContactServices();
			List<ContactBean> list=services1.getAllContacts();
			if(list!=null) {
				for (ContactBean user : list) {
					System.out.println(user);
				}
			}
			else {
				System.out.println("Contact details not found....!!!");
			}

		

		}
	}

