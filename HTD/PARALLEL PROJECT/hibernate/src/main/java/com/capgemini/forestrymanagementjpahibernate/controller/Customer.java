package com.capgemini.forestrymanagementjpahibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementjpahibernate.dao.CustomerDao;
import com.capgemini.forestrymanagementjpahibernate.dto.CustomerBean;
import com.capgemini.forestrymanagementjpahibernate.exceptions.ValidationException;
import com.capgemini.forestrymanagementjpahibernate.factory.CustomerFactory;
import com.capgemini.forestrymanagementjpahibernate.service.CustomerService;
import com.capgemini.forestrymanagementjpahibernate.validations.Validations;

public class Customer {
	@SuppressWarnings("resource")
	public static void customer() {
		CustomerBean customerBean = new CustomerBean();
		Validations validate = new Validations();
		CustomerDao dao = CustomerFactory.instanceOfCustomerDAOImpl();
		Scanner scanner = new Scanner(System.in);
		char ch = 'y';
		while (ch == 'y' || ch == 'y') {
			System.out.println("------customer-------");
			System.out.println("Enter 1 to insert data");
			System.out.println("Enter 2 to delete data");
			System.out.println("Enter 3 to search data");
			System.out.println("Enter 4 to get all data");
			System.out.println("Enter 5 to update data");
			System.out.println("Enter 6 to return back");

			String choice = scanner.next();
			boolean isValidChoice = validate.idValidation(choice);
			while (!isValidChoice) {
				try {
					throw new ValidationException();
				} catch (ValidationException e1) {
					System.out.println("please enter only valid data");
					System.out.println("enter it again");
					choice = scanner.next();
					if (validate.idValidation(choice)) {
						break;
					}
				}
			}
			switch (Integer.parseInt(choice)) {
			case 1:

				System.out.println("Enter customerid...");
				String customerid = scanner.next();
				boolean isValidId = validate.idValidation(customerid);
				while (!isValidId) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the number (range between 1-6)");
						System.out.println("enter it again");
						customerid = scanner.next();
						if (validate.idValidation(customerid)) {
							break;
						}
					}
				}
				System.out.println("Enter telephoneno...");
				String telephoneno = scanner.next();
				boolean isValidTelephone = validate.phoneNumberValidation(telephoneno);
				while (!isValidTelephone) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter phoneNumber[7-9]{0-9} in 10 digits");
						System.out.println("enter it again");
						telephoneno = scanner.next();
						if (validate.phoneNumberValidation(telephoneno)) {
							break;
						}
					}
				}
				System.out.println("Enter customername...");
				String customername = scanner.next();
				boolean isValidName = validate.nameValidation(customername);
				while (!isValidName) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the name [A-Z a-z]");
						System.out.println("enter it again");
						customername = scanner.next();
						if (validate.nameValidation(customername)) {
							break;
						}
					}
				}
				System.out.println("Enter customeraddress1...");
				String customerAddress1 = scanner.next();
				System.out.println("Enter customeraddress2...");
				String customerAddress2 = scanner.next();
				System.out.println("Enter town...");
				String town = scanner.next();
				boolean isValidTown = validate.nameValidation(town);
				while (!isValidTown) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the town [A-Z a-z]");
						System.out.println("enter it again");
						town = scanner.next();
						if (validate.idValidation(town)) {
							break;
						}
					}
				}
				System.out.println("Enter postalCode...");
				String postCode = scanner.next();
				boolean isValidPost = validate.pincodeValidation(postCode);
				while (!isValidPost) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the postcode in exactly 6 digits");
						System.out.println("enter it again");
						postCode = scanner.next();
						if (validate.pincodeValidation(postCode)) {
							break;
						}
					}
				}
				System.out.println("Enter email....");
				String email = scanner.next();
				boolean isValidEmail = validate.emailValidation(email);
				while (!isValidEmail) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter only valid email");
						System.out.println("enter it again");
						email = scanner.next();
						if (validate.idValidation(email)) {
							break;
						}
					}
				}
				CustomerBean customerBean1 = new CustomerBean();
				customerBean1.setCustomerId(Integer.parseInt(customerid));
				customerBean1.setCustomerName(customername);
				customerBean1.setTelephone(Long.parseLong(telephoneno));
				customerBean1.setCustomerAddress1(customerAddress1);
				customerBean1.setCustomerAddress2(customerAddress2);
				customerBean1.setTown(town);
				customerBean1.setPostalCode(Integer.parseInt(postCode));
				customerBean1.setEmail(email);
				try {
					boolean check = dao.insertCustomer(customerBean1);
					if (check) {
						System.out.println("customer details added to the list");
					} else {
						System.out.println("customerid is repeated");
					}
				} catch (Exception e) {
					System.out.println("Id repeated Exception");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;

			case 2:
				System.out.println("Enter customerid to delete");
				try {
					int customerid3 = scanner.nextInt();
					if (dao.deleteCustomer(customerid3)) {

						System.out.println("given customerid details has been deleted");
					} else {
						System.out.println("sorry....Unable to deleted");
					}
				} catch (Exception e) {
					System.out.println("Id not repeated exception");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);

				break;
			case 3:
				System.out.println("Enter customerid to search");
				try {
					customerBean.setCustomerId(scanner.nextInt());
					CustomerBean bean2 = dao.getCustomer(customerBean.getCustomerId());
					if (bean2 != null) {
						System.out.println("customerId:" + bean2.getCustomerId());
						System.out.println("customerName:" + bean2.getCustomerName());
						System.out.println("streetaddress1:" + bean2.getCustomerAddress1());
						System.out.println("streetaddress2:" + bean2.getCustomerAddress2());
						System.out.println("town:" + bean2.getTown());
						System.out.println("postalcode:" + bean2.getPostalCode());
						System.out.println("telephone:" + bean2.getTelephone());
						System.out.println("email:" + bean2.getEmail());

					} else {
						System.out.println("customer details not found....!!!");
					}
				} catch (Exception e) {
					System.out.println("Id not repeated exception");
				}

				System.out.println("do u want to countinue(y/n)");
				ch = scanner.next().charAt(0);

				break;
			case 4:
				try {
					CustomerService services1 = CustomerFactory.instanceOfCustomerServices();
					List<CustomerBean> list = services1.getAllCustomers();
					if (list != null) {
						for (CustomerBean user : list) {
							System.out.println(user);
						}
					} else {
						System.out.println("customer details not found....!!!");
					}
				} catch (Exception e) {
					System.out.println("Id not found exception");
				}

				System.out.println("do u want to countinue(y/n)");
				ch = scanner.next().charAt(0);

				break;
			case 5:
				CustomerService services = CustomerFactory.instanceOfCustomerServices();
				customerBean = new CustomerBean();
				System.out.println("Enter customerid...");
				String customerId = scanner.next();
				boolean isValidNewId = validate.idValidation(customerId);
				while (!isValidNewId) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the number (range between 1-6)");
						System.out.println("enter it again");
						customerId = scanner.next();
						if (validate.idValidation(customerId)) {
							break;
						}
					}
				}
				customerBean.setCustomerId(Integer.parseInt(customerId));
				System.out.println("Enter customername to update..");
				String customerName = scanner.next();
				boolean isValidNewName = validate.nameValidation(customerName);
				while (!isValidNewName) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter name[A-Z a-z]");
						System.out.println("enter it again");
						customerName = scanner.next();
						if (validate.nameValidation(customerName)) {
							break;
						}
					}
				}
				customerBean.setCustomerName(customerName);
				try {
					if (services.updateCustomer(customerBean.getCustomerId(), customerBean.getCustomerName())) {
						System.out.println("customer updated");
					} else {
						System.out.println("something went wrong...");
					}
				} catch (Exception e) {
					System.out.println("Id not found Exception");
				}
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			case 6:
				ForestrySystem.forestDetails();
				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;

			default:
				break;
			}
		}
	}

}
