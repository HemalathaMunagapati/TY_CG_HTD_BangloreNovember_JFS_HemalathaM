package com.caps.phone_simulatorapp.contact_list;

import java.util.Scanner;

import com.caps.phone_simulatorapp.contactbean.ContactBean;
import com.caps.phone_simulatorapp.contactdao.ContactDAO;
import com.caps.phone_simulatorapp.contactservices.ContactServices;
import com.caps.phone_simulatorapp.factory.ContactFactory;

public class Contact_Options {

	public void getOptions() {
		ContactBean bean=new ContactBean();
		ContactDAO dao=ContactFactory.instanceOfContactDAOImpl();
		Scanner sc=new Scanner(System.in);
		char ch='y';
		while(ch=='y'||ch=='y') {
			System.out.println("Enter 1 to add data");
			System.out.println("Enter 2 to delete data");
			System.out.println("Enter 3 to edit data");
			
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter contactname...");
				String contactname=sc.next();
				System.out.println("Enter phoneno...");
				int phno=sc.nextInt();
				System.out.println("Enter groups...");
				String groups=sc.next();
				ContactBean bean1=new ContactBean();
				bean1.setContactname(contactname);
				bean1.setPhno(phno);
				bean1.setGroup(groups);
				boolean check=dao.addContact(bean1);
				if(check) {
					System.out.println("contact is added to the contactList");
				}
				else {
					System.out.println("sorry...something wrong...");
				}
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
			case 2:
				System.out.println("Enter contractno to delete");
				String contactname2=sc.next();
				if(dao.deleteContact(contactname2)) {
				
					System.out.println("given contactname details has been deleted");
				}
				else {
					System.out.println("sorry....Unable to deleted");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
			case 3:
				ContactServices services=ContactFactory.instanceOfContactServices();
				ContactBean user=new ContactBean();
				System.out.println("Enter contactname...");
				user.setContactname(sc.next());
				if(services.editContact(user.getContactname())) {
					System.out.println("contact updated...");
				}
				else {
					System.out.println("something...wrong");
				}
			
				
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
				
	}
		}
	}

}
