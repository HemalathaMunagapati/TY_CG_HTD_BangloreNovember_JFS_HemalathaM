package com.capgemini.forestrymanagementjpahibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementjpahibernate.dao.ContractDao;
import com.capgemini.forestrymanagementjpahibernate.dto.ContractBean;
import com.capgemini.forestrymanagementjpahibernate.exceptions.ValidationException;
import com.capgemini.forestrymanagementjpahibernate.factory.ContractFactory;
import com.capgemini.forestrymanagementjpahibernate.service.ContractService;
import com.capgemini.forestrymanagementjpahibernate.validations.Validations;

public class Contractor {
	@SuppressWarnings("resource")
	public static void contractor() {
		ContractBean contractBean = new ContractBean();
		Validations validate = new Validations();
		ContractDao dao = ContractFactory.instanceOfContractorDAOImpl();
		Scanner scanner = new Scanner(System.in);
		char ch = 'y';
		while (ch == 'y' || ch == 'y') {
			System.out.println("--------contract--------");
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
				System.out.println("Enter contractno...");
				String contractno = scanner.next();
				boolean isValidNo = validate.idValidation(contractno);
				while (!isValidNo) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the number (range between 1-6)");
						System.out.println("enter it again");
						contractno = scanner.next();
						if (validate.idValidation(contractno)) {
							break;
						}
					}
				}
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
				System.out.println("Enter haulierid...");
				String haulierid = scanner.next();
				boolean isValidHid = validate.idValidation(haulierid);
				while (!isValidHid) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the number (range between 1-6)");
						System.out.println("enter it again");
						haulierid = scanner.next();
						if (validate.idValidation(haulierid)) {
							break;
						}
					}
				}
				System.out.println("Enter productid...");
				String productid = scanner.next();
				boolean isValidPid = validate.idValidation(productid);
				while (!isValidPid) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the number (range between 1-6)");
						System.out.println("enter it again");
						productid = scanner.next();
						if (validate.idValidation(productid)) {
							break;
						}
					}
				}
				System.out.println("Enter deliverydate...");
				String deliveryDate = scanner.next();
				boolean isValidDate = validate.dateValidation(deliveryDate);
				while (!isValidDate) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter date in yyyy/mm/dd format");
						System.out.println("enter it again");
						deliveryDate = scanner.next();
						if (validate.dateValidation(deliveryDate)) {
							break;
						}
					}
				}
				System.out.println("Enter quantity...");
				String quantity = scanner.next();
				boolean isValidQuant = validate.idValidation(quantity);
				while (!isValidQuant) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the number (range between 1-6)");
						System.out.println("enter it again");
						quantity = scanner.next();
						if (validate.idValidation(quantity)) {
							break;
						}
					}
				}
				System.out.println("Enter deliveryday...");
				String deliveryDay = scanner.next();
				boolean isValidDay = validate.dayValidation(deliveryDay);
				while (!isValidDay) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter valid day format");
						System.out.println("enter it again");

						deliveryDay = scanner.next();
						if (validate.dayValidation(deliveryDay)) {
							break;
						}
					}
				}
				ContractBean contractBean1 = new ContractBean();
				contractBean1.setContractNo(Integer.parseInt(contractno));
				contractBean1.setCustomerId(Integer.parseInt(customerid));
				contractBean1.setHaulierId(Integer.parseInt(haulierid));
				contractBean1.setProductId(Integer.parseInt(productid));
				contractBean1.setDeliveryDate(deliveryDate);
				contractBean1.setQuantity(Integer.parseInt(quantity));
				contractBean1.setDeliveryDay(deliveryDay);
				try {
					boolean check = dao.insertContracter(contractBean1);
					if (check) {
						System.out.println("contract details added to the list");
					} else {
						System.out.println("contractno is repeated");
					}
				} catch (Exception e) {
					System.out.println("Id repeated Exceptions");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;

			case 2:
				System.out.println("Enter contractno to delete");
				try {
					int contractno3 = scanner.nextInt();
					if (dao.deleteContract(contractno3)) {

						System.out.println("given contractno details has been deleted");
					} else {
						System.out.println("sorry....Unable to deleted");
					}
				} catch (Exception e) {
					System.out.println("Id not found exception");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);

				break;
			case 3:
				try {
					System.out.println("Enter contractno to search");
					contractBean.setContractNo(scanner.nextInt());
					ContractBean contractBean2 = dao.getContracter(contractBean.getContractNo());
					if (contractBean2 != null) {
						System.out.println("cotractno:" + contractBean2.getContractNo());
						System.out.println("customerid:" + contractBean2.getCustomerId());
						System.out.println("productid:" + contractBean2.getProductId());
						System.out.println("haulierid:" + contractBean2.getHaulierId());
						System.out.println("deliverydate:" + contractBean2.getDeliveryDate());
						System.out.println("deliveryday:" + contractBean2.getDeliveryDay());
						System.out.println("quantity:" + contractBean2.getQuantity());

					} else {
						System.out.println("contract details not found....!!!");
					}
				} catch (Exception e) {
					System.out.println("Id not found exception..");
				}

				System.out.println("do u want to countinue(y/n)");
				ch = scanner.next().charAt(0);

				break;
			case 4:
				try {
					ContractService services = ContractFactory.instanceOfContractorServices();
					List<ContractBean> list = services.getAllContracts();
					if (list != null) {
						for (ContractBean user : list) {
							System.out.println(user);
						}
					} else {
						System.out.println("contract details not found....!!!");
					}
				} catch (Exception e) {
					System.out.println("Id not found exception");
				}

				System.out.println("do u want to countinue(y/n)");
				ch = scanner.next().charAt(0);

				break;
			case 5:

				ContractService service = ContractFactory.instanceOfContractorServices();
				System.out.println("Enter contractno...");
				String contractNo = scanner.next();
				boolean isValidNewNo = validate.idValidation(contractNo);
				while (!isValidNewNo) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the number (range between 1-6)");
						System.out.println("enter it again");
						contractNo = scanner.next();
						if (validate.idValidation(contractNo)) {
							break;
						}
					}
				}
				contractBean.setContractNo(Integer.parseInt(contractNo));
				System.out.println("Enter deliverydate to update..");
				String newDeliveryDate = scanner.next();
				boolean isValidNewDate = validate.dateValidation(newDeliveryDate);
				while (!isValidNewDate) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter date in yyyy/mm/dd format");
						System.out.println("enter it again");
						newDeliveryDate = scanner.next();
						if (validate.dateValidation(newDeliveryDate)) {
							break;
						}
					}
				}
				contractBean.setDeliveryDate(newDeliveryDate);
				try {
					if (service.updateContract(contractBean.getContractNo(), contractBean.getDeliveryDate())) {
						System.out.println("contract details updated");
					} else {
						System.out.println("something went wrong...");
					}
				} catch (Exception e) {
					System.out.println("Id not found exception");
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
