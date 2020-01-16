package com.capgemini.forestrymanagementjpahibernate.controller;

import java.util.Scanner;

import com.capgemini.forestrymanagementjpahibernate.exceptions.ValidationException;
import com.capgemini.forestrymanagementjpahibernate.factory.ForestFactory;
import com.capgemini.forestrymanagementjpahibernate.service.SchedulerService;
import com.capgemini.forestrymanagementjpahibernate.validations.Validations;

public class Scheduler {
	@SuppressWarnings("resource")
	public static void scheduler() {
		SchedulerService service = ForestFactory.instanceOfSchedulerServiceImpl();
		Validations validate = new Validations();
		Scanner scanner = new Scanner(System.in);
		char ch = 'y';
		while (ch == 'Y' || ch == 'y') {
			System.out.println("Enter 1 to login..");
			System.out.println("Enter 2 to logout");
			String choice = scanner.next();
			Boolean isValid = validate.idValidation(choice);
			while (!isValid) {
				try {
					throw new ValidationException();
				} catch (ValidationException e1) {
					System.out.println("please enter only valid numbers");
					System.out.println("Enter 1 to login..");
					System.out.println("Enter 2 to logout");
					System.out.println("enter it again");
					choice = scanner.next();
					if (validate.idValidation(choice)) {
						break;
					}
				}
			}

			switch (Integer.parseInt(choice)) {
			case 1:
				System.out.println("Enter email...");
				String eMail1 = scanner.next();
				boolean isValidEmail1 = validate.emailValidation(eMail1);
				while (!isValidEmail1) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter only valid mail Ex:(Abcd@gmail.com)");
						System.out.println("enter it again");
						eMail1 = scanner.next();
						if (validate.emailValidation(eMail1)) {
							break;
						}
					}
				}
				System.out.println("Enter password...");
				String password1 = scanner.next();
				boolean isPassword1 = validate.passwordValidation(password1);
				while (!isPassword1) {
					try {
						throw new ValidationException();
					} catch (ValidationException e) {
						System.out.println("Enter password..Ex:(Abcd@1234)");
						System.out.println("enter it again..");
						password1 = scanner.next();
						if (validate.passwordValidation(password1)) {
							break;
						}

					}
				}
				boolean check1 = service.login(eMail1, password1);
				if (check1) {
					System.out.println("login successfull...");
					System.out.println("****************.........welcome Scheduler........*****************");
					ForestrySystem.haulierDetails();
				} else {
					System.err.println("try again...");
					return;
				}

				break;

			case 2:
				System.err.println("you are logged out..!!");
				System.exit(Integer.parseInt(choice));

			}

		}
	}

}
