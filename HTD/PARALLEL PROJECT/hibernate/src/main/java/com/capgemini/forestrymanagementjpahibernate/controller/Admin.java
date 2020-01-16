package com.capgemini.forestrymanagementjpahibernate.controller;

import java.util.Scanner;


import com.capgemini.forestrymanagementjpahibernate.dto.AdminBean;
import com.capgemini.forestrymanagementjpahibernate.exceptions.ValidationException;
import com.capgemini.forestrymanagementjpahibernate.factory.ForestFactory;
import com.capgemini.forestrymanagementjpahibernate.main.ForestryMain;
import com.capgemini.forestrymanagementjpahibernate.service.AdminService;
import com.capgemini.forestrymanagementjpahibernate.validations.Validations;

public class Admin {

	@SuppressWarnings("resource")
	static void credentials() {
		AdminService service = ForestFactory.instanceOfAdminServiceImpl();
		Validations validate = new Validations();
		AdminBean adminBean = new AdminBean();
		Scanner scanner = new Scanner(System.in);
		char ch = 'y';
		while (ch == 'Y' || ch == 'y') {
			System.out.println("Enter 1 to create client...");
			System.out.println("Enter 2 to create scheduler....");
			System.out.println("Enter 3 to delete client...");
			System.out.println("Enter 4 to delete scheduler...");
			System.out.println("Emter 5 to go back to home..");
			System.out.println("Enter 6 to logout");
			String choice = scanner.next();
			Boolean isValid = validate.idValidation(choice);
			while (!isValid) {
				try {
					throw new ValidationException();
				} catch (ValidationException e1) {
					System.out.println("please enter only valid numbers");
					System.out.println("Enter 1 to signup...");
					System.out.println("Enter 2 to login..");
					System.out.println("Enter 3 to logout");
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
				String email = scanner.next();
				boolean isValidEmail = validate.emailValidation(email);
				while (!isValidEmail) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter only valid mail Ex:(Abc@gmail.com)");
						System.out.println("enter it again");
						email = scanner.next();
						if (validate.emailValidation(email)) {
							break;
						}
					}
				}
				adminBean.setEmail(email);
				System.out.println("Enter password...");
				String password = scanner.next();
				boolean isPassword = validate.passwordValidation(password);
				while (!isPassword) {
					try {
						throw new ValidationException();
					} catch (ValidationException e) {
						System.out.println("Enter password..Ex:(Abcd@1234)");
						System.out.println("enter it again..");
						password = scanner.next();
						if (validate.passwordValidation(password)) {
							break;
						}

					}
				}
				adminBean.setPassword(password);
				System.out.println("Enter role type");
				String role = scanner.next();
				boolean isRole = validate.nameValidation(role);
				while (!isRole) {
					try {
						throw new ValidationException();
					} catch (ValidationException e) {
						System.out.println("Enter password..");
						System.out.println("enter it again..");
						role = scanner.next();
						if (validate.nameValidation(role)) {
							break;
						}

					}
				}
				adminBean.setRole(role);
				boolean check = service.addClient(adminBean.getEmail(), adminBean);
				if (check) {
					System.out.println("client credentials added...");
				} else {
					System.out.println("client details already exists");
				}
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			case 2:
				System.out.println("Enter email...");
				String email1 = scanner.next();
				boolean isValidEmail1 = validate.emailValidation(email1);
				while (!isValidEmail1) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter only valid mail Ex:(Abc@gmail.com)");
						System.out.println("enter it again");
						email1 = scanner.next();
						if (validate.emailValidation(email1)) {
							break;
						}
					}
				}
				adminBean.setEmail(email1);
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
				adminBean.setPassword(password1);
				System.out.println("Enter role type");
				String role1 = scanner.next();
				boolean isRole1 = validate.nameValidation(role1);
				while (!isRole1) {
					try {
						throw new ValidationException();
					} catch (ValidationException e) {
						System.out.println("Enter role..Ex:(client,scheduler)");
						System.out.println("enter it again..");
						role1 = scanner.next();
						if (validate.nameValidation(role1)) {
							break;
						}

					}
				}
				adminBean.setRole(role1);
				boolean check1 = service.addScheduler(adminBean.getEmail(), adminBean);
				if (check1) {
					System.out.println("client credentials added...");
				} else {
					System.out.println("client details already exists");
				}
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			case 3:
				System.out.println("Enter client email to delete");
				String email3 = scanner.next();
				if (service.deleteClient(email3)) {

					System.out.println("given client details has been deleted");
				} else {
					System.err.println("sorry....Unable to deleted");
				}
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			case 4:
				System.out.println("Enter scheduler email to delete");
				String email4 = scanner.next();
				if (service.deleteScheduler(email4)) {

					System.out.println("given scheduler details has been deleted");
				} else {
					System.err.println("sorry....Unable to deleted");
				}
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			case 5:
				ForestryMain.main(null);
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			case 6:
				System.err.println("you are logged out..!!");
				System.exit(Integer.parseInt(choice));
			}

		}

	}

	@SuppressWarnings("resource")
	public static void admin() {
		AdminService service = ForestFactory.instanceOfAdminServiceImpl();
		Validations validate = new Validations();
		Scanner scanner = new Scanner(System.in);
		char ch = 'y';
		while (ch == 'Y' || ch == 'y') {
			System.out.println("Enter 1 to register...");
			System.out.println("Enter 2 to login..");
			System.out.println("Enter 3 to logout");
			String choice = scanner.next();
			Boolean isValid = validate.idValidation(choice);
			while (!isValid) {
				try {
					throw new ValidationException();
				} catch (ValidationException e1) {
					System.out.println("please enter only valid numbers");
					System.out.println("Enter 1 to register...");
					System.out.println("Enter 2 to login..");
					System.out.println("Enter 3 to logout");
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
				String eMail = scanner.next();
				boolean isValidEmail = validate.emailValidation(eMail);
				while (!isValidEmail) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter only valid mail Ex:(Abc@gmail.com)");
						System.out.println("enter it again");
						eMail = scanner.next();
						if (validate.emailValidation(eMail)) {
							break;
						}
					}
				}
				System.out.println("Enter password...");
				String password = scanner.next();
				boolean isPassword = validate.passwordValidation(password);
				while (!isPassword) {
					try {
						throw new ValidationException();
					} catch (ValidationException e) {
						System.out.println("Enter password..Ex:(Abcd@1234)");
						System.out.println("enter it again..");
						password = scanner.next();
						if (validate.passwordValidation(password)) {
							break;
						}

					}
				}
				boolean check = service.signup(eMail, password);
				if (check) {
					System.out.println("signup successfull...");
				} else {
					System.err.println("try again...");
					return;
				}
				break;
			case 2:
				System.out.println("Enter email...");
				String eMail1 = scanner.next();
				boolean isValidEmail1 = validate.emailValidation(eMail1);
				while (!isValidEmail1) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter only valid mail Ex:(Abc@gmail.com)");
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
					System.out.println("***********...... Welocome ADMIN........*************");
					Admin.credentials();

				} else {
					System.err.println("try again...");
					return;
				}
				break;

			case 3:
				System.err.println("you are logged out..!!");
				System.exit(Integer.parseInt(choice));

			}

		}

	}
}
