package com.caps.phone_simulation.contact_list;

import java.util.Scanner;

import com.caps.phone_simulatorapp.contactbean.ContactBean;
import com.caps.phone_simulatorapp.contactdao.ContactDAO;
import com.caps.phone_simulatorapp.factory.ContactFactory;

import cpm.caps.phone_simulation.contact.Contact_Info;

public class Contact_Search {
public void call() {
		
	}

	public void getName() {
		
			
			ContactBean bean=new ContactBean();
			ContactDAO dao=ContactFactory.instanceOfContactDAOImpl();
			Scanner sc=new Scanner(System.in);
			char ch='y';
			while(ch=='y'||ch=='y') {
				System.out.println("press 1 to call...");
				System.out.println("Enter 2 to message...");
				System.out.println("Enter 3 to go back to main menu...");
				System.out.println("Enter 5 to return contact_info:)");
				
				int choice=sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("calling to your favourite contact_list...");
					System.out.println("do u want to countinue(y/n) ");
					ch=sc.next().charAt(0);
					break;
				case 2:
					System.out.println("fetching the message..");
					System.out.println("do u want to countinue(y/n) ");
					ch=sc.next().charAt(0);
					break;
				case 3:
					Contact_Search s=new Contact_Search();
					s.getName();
					System.out.println("do u want to countinue(y/n) ");
					ch=sc.next().charAt(0);
					break;
				case 4:
					Contact_Info cinf=new Contact_Info();
					cinf.main(null);
					System.out.println("do u want to countinue(y/n) ");
					ch=sc.next().charAt(0);
					break;
					

		
	}

}
	}

}
