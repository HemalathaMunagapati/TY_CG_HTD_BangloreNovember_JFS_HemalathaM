package phone_simulator;

import java.util.Scanner;

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
		
		
	}
		}  
	}
}