package com.capgemini.forestrymanagementjpahibernate.main;

import java.util.Scanner;

import com.capgemini.forestrymanagementjpahibernate.controller.Admin;
import com.capgemini.forestrymanagementjpahibernate.controller.Client;
import com.capgemini.forestrymanagementjpahibernate.controller.Scheduler;
import com.capgemini.forestrymanagementjpahibernate.exceptions.ValidationException;
import com.capgemini.forestrymanagementjpahibernate.validations.Validations;

public class ForestryMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Validations validate = new Validations();
		Scanner scanner = new Scanner(System.in);
		char ch = 'y';
		while (ch == 'Y' || ch == 'y') {
			System.out.println("Enter 1 for admin...");
			System.out.println("Enter 2 for client..");
			System.out.println("Enter 3 for scheduler...");
			String choice = scanner.next();
			Boolean isValid = validate.idValidation(choice);
			while (!isValid) {
				try {
					throw new ValidationException();
				} catch (ValidationException e1) {
					System.out.println("please enter only valid numbers");
					System.out.println("Enter 1 for admin...");
					System.out.println("Enter 2 for client..");
					System.out.println("Enter 3 for scheduler...");
					System.out.println("enter it again");
					choice = scanner.next();
					if (validate.idValidation(choice)) {
						break;
					}
				}
			}

			switch (Integer.parseInt(choice)) {
			case 1:
				Admin.admin();
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;

			case 2:
				Client.client();
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;

			case 3:
				Scheduler.scheduler();
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;

			}
		}
	}

}
