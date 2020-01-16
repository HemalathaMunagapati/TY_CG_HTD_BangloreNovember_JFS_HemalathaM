package com.capgemini.forestrymanagementjpahibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementjpahibernate.dao.HaulierDao;
import com.capgemini.forestrymanagementjpahibernate.dto.HaulierBean;
import com.capgemini.forestrymanagementjpahibernate.exceptions.ValidationException;
import com.capgemini.forestrymanagementjpahibernate.factory.HaulierFactory;
import com.capgemini.forestrymanagementjpahibernate.service.HaulierService;
import com.capgemini.forestrymanagementjpahibernate.validations.Validations;

public class Haulier {
	@SuppressWarnings("resource")
	public static void haulier() {

		HaulierBean haulierBean = new HaulierBean();
		Validations validate = new Validations();
		HaulierDao dao = HaulierFactory.instanceOfHaulierDaoImpl();
		Scanner scanner = new Scanner(System.in);
		char ch = 'y';
		while (ch == 'y' || ch == 'y') {
			System.out.println("------haulier--------");
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
				System.out.println("Enter haulierid..");
				String haulierId = scanner.next();
				boolean isValidId = validate.idValidation(haulierId);
				while (!isValidId) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the number (range between 1-6)");
						System.out.println("enter it again");
						haulierId = scanner.next();
						if (validate.idValidation(haulierId)) {
							break;
						}
					}
				}
				System.out.println("Enter email..");
				String eMail = scanner.next();
				boolean isValidEmail = validate.emailValidation(eMail);
				while (!isValidEmail) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter valid email");
						System.out.println("enter it again");
						eMail = scanner.next();
						if (validate.emailValidation(eMail)) {
							break;
						}
					}
				}
				System.out.println("Enter haulier name..");
				String haulierName = scanner.next();
				boolean isValidName = validate.nameValidation(haulierName);
				while (!isValidName) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter name(A-z a-z)");
						System.out.println("enter it again");
						haulierName = scanner.next();
						if (validate.nameValidation(haulierName)) {
							break;
						}
					}
				}
				System.out.println("Enter postalcode..");
				String postalCode = scanner.next();
				boolean isValidPost = validate.pincodeValidation(postalCode);
				while (!isValidPost) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter exactly 6 digits");
						System.out.println("enter it again");
						postalCode = scanner.next();
						if (validate.pincodeValidation(postalCode)) {
							break;
						}
					}
				}

				System.out.println("street address1..");
				String streetAddress1 = scanner.next();
				System.out.println("street address2..");
				String streetAddress2 = scanner.next();
				System.out.println("Enter town..");
				String town = scanner.next();
				boolean isValidTown = validate.nameValidation(town);
				while (!isValidTown) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter only alphabets [A-Z][a-z]");
						System.out.println("enter it again");
						town = scanner.next();
						if (validate.nameValidation(town)) {
							break;
						}
					}
				}

				HaulierBean bean1 = new HaulierBean();
				bean1.setHaulierId(Integer.parseInt(haulierId));
				bean1.setHaulierName(haulierName);
				bean1.setStreetAddress1(streetAddress1);
				bean1.setStreetAddress2(streetAddress2);
				bean1.setTown(town);
				bean1.setPostalCode(Integer.parseInt(postalCode));
				bean1.setEmail(eMail);
				try {
					boolean check = dao.insertHaulier(bean1);
					if (check) {
						System.out.println("haulier details added to the list");
					} else {
						System.out.println("haulierId is repeated");
					}
				} catch (Exception e) {
					System.out.println("Id repeated exception");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			case 2:
				System.out.println("Enter haulierid to delete");
				try {
					int haulierId3 = scanner.nextInt();
					if (dao.deleteHaulier(haulierId3)) {

						System.out.println("given haulierid details has been deleted");
					} else {
						System.out.println("sorry....Unable to deleted");
					}
				} catch (Exception e) {
					System.out.println("Id not found Exception");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);

				break;
			case 3:
				System.out.println("Enter haulierid to search");
				try {
					haulierBean.setHaulierId(scanner.nextInt());
					HaulierBean bean2 = dao.getHaulier(haulierBean.getHaulierId());
					if (bean2 != null) {
						System.out.println("haulierId:" + bean2.getHaulierId());
						System.out.println("hauliername:" + bean2.getHaulierName());
						System.out.println("streetaddress1:" + bean2.getStreetAddress1());
						System.out.println("streetaddress2:" + bean2.getStreetAddress2());
						System.out.println("posatlcode:" + bean2.getPostalCode());
						System.out.println("town:" + bean2.getTown());
						System.out.println("email:" + bean2.getEmail());

					} else {
						System.out.println("haulierid details not found....!!!");
					}
				} catch (Exception e) {
					System.out.println("Id not found Exception");
				}

				System.out.println("do u want to countinue(y/n)");
				ch = scanner.next().charAt(0);

				break;
			case 4:
				try {
					HaulierService services = HaulierFactory.instanceOfHaulierServices();
					List<HaulierBean> list = services.getAllHauliers();
					if (list != null) {
						for (HaulierBean user : list) {
							System.out.println(user);
						}
					} else {
						System.out.println("haulierid details not found....!!!");
					}
				} catch (Exception e) {
					System.out.println("Id not found Exception");
				}

				System.out.println("do u want to countinue(y/n)");
				ch = scanner.next().charAt(0);

				break;
			case 5:

				HaulierService service = HaulierFactory.instanceOfHaulierServices();
				System.out.println("Enter haulierid...");
				String haulierId1 = scanner.next();
				boolean isValidId1 = validate.idValidation(haulierId1);
				while (!isValidId1) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the number (range between 1-6)");
						System.out.println("enter it again");
						haulierId1 = scanner.next();
						if (validate.idValidation(haulierId1)) {
							break;
						}
					}
				}
				haulierBean.setHaulierId(Integer.parseInt(haulierId1));
				System.out.println("Enter hauliername to update..");
				String haulierNewName = scanner.next();
				boolean isValidIdName = validate.nameValidation(haulierNewName);
				while (!isValidIdName) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter only alphabets [A-Z][a-z]");
						System.out.println("enter it again");
						haulierNewName = scanner.next();
						if (validate.nameValidation(haulierNewName)) {
							break;
						}
					}
				}
				haulierBean.setHaulierName(haulierNewName);
				try {
					if (service.updateHaulier(haulierBean.getHaulierId(), haulierBean.getHaulierName())) {
						System.out.println("haulier details updated");
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
