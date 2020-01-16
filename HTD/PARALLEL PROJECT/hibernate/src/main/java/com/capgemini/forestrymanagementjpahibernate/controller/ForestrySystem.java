package com.capgemini.forestrymanagementjpahibernate.controller;

import java.util.Scanner;

import com.capgemini.forestrymanagementjpahibernate.exceptions.ValidationException;
import com.capgemini.forestrymanagementjpahibernate.main.ForestryMain;
import com.capgemini.forestrymanagementjpahibernate.validations.Validations;

public class ForestrySystem {
	public static void haulierDetails() {
		Scanner scanner = new Scanner(System.in);
		Validations validate = new Validations();
		char ch = 'y';
		while (ch == 'y' || ch == 'y') {
			System.out.println("press 1 haulier details..");
			System.out.println("press 2 to back to home");
			String choice = scanner.next();
			Boolean isValid = validate.idValidation(choice);
			while (!isValid) {
				try {
					throw new ValidationException();
				} catch (ValidationException e1) {
					System.out.println("please enter only valid numbers");
					System.out.println("press 1 haulier details..");
					System.out.println("press 2 to back to home");
					System.out.println("enter it again");
					choice = scanner.next();
					if (validate.idValidation(choice)) {
						break;
					}
				}
			}

			switch (Integer.parseInt(choice)) {
			case 1:
				Haulier.haulier();
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			case 2:
				Admin.admin();
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			}
			scanner.close();
		}

	}

	@SuppressWarnings("resource")
	public static void forestDetails() {
		Validations validate = new Validations();
		Scanner scanner = new Scanner(System.in);
		char ch = 'y';
		while (ch == 'y' || ch == 'y') {
			System.out.println("------------------ ************---------------------");
			System.out.println("(((:HOME:))))");
			System.out.println("Press 1 for contract");
			System.out.println("Press 2 for customer");
			System.out.println("press 3 for order");
			System.out.println("Press 4  for a product");
			System.out.println("press 5 to go back to home..");
			String choice = scanner.next();
			Boolean isValid = validate.idValidation(choice);
			while (!isValid) {
				try {
					throw new ValidationException();
				} catch (ValidationException e1) {
					System.out.println("please enter only valid numbers");
					System.out.println("Press 1 for contract");
					System.out.println("Press 2 for customer");
					System.out.println("press 3 for order");
					System.out.println("Press 4  for a product");
					System.out.println("press 5 to go back to home..");
					System.out.println("enter it again");
					choice = scanner.next();
					if (validate.idValidation(choice)) {
						break;
					}
				}
			}

			switch (Integer.parseInt(choice)) {
			case 1:
				Contractor.contractor();
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			case 2:
				Customer.customer();
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			case 3:
				Order.order();
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			case 4:
				Product.product();
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			case 5:
				ForestryMain.main(null);
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;

			}

		}

	}
}
