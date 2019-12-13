package com.caps.phone_simulatorapp.contact;

import java.util.Scanner;

import com.caps.phone_simulatorapp.contact_list.Contact_List;
import com.caps.phone_simulatorapp.contact_list.Contact_Options;
import com.caps.phone_simulatorapp.contact_list.Contact_Search;



public class Contact_Info {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch='y';
		while(ch=='y'||ch=='y') {
			System.out.println("------------------ PHONE SIMULATOR APPLICATION----------------------");
			System.out.println("press 1 to Show all contacts..");
			System.out.println("press 2 to Search for contact...");
			System.out.println("press 3 to Operate on contact....");
			int choose=sc.nextInt();


			switch (choose) {
			case 1:
				Contact_List clist=new Contact_List();
                clist.list();
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
			case 2:
				Contact_Search search=new Contact_Search();
				search.getName();
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
			case 3:
				Contact_Options option=new Contact_Options();
				option.getOptions();
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;



			}
		}  
	}


}
