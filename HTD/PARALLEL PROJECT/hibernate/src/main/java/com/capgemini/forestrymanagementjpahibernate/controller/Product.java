package com.capgemini.forestrymanagementjpahibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementjpahibernate.dao.ProductDao;
import com.capgemini.forestrymanagementjpahibernate.dto.ProductBean;
import com.capgemini.forestrymanagementjpahibernate.exceptions.ValidationException;
import com.capgemini.forestrymanagementjpahibernate.factory.ProductFactory;
import com.capgemini.forestrymanagementjpahibernate.service.ProductService;
import com.capgemini.forestrymanagementjpahibernate.validations.Validations;

public class Product {
	@SuppressWarnings("resource")
	public static void product() {
		ProductBean productBean = new ProductBean();
		Validations validate = new Validations();
		ProductDao dao = ProductFactory.instanceOfProductDAOImpl();
		Scanner scanner = new Scanner(System.in);
		char ch = 'y';
		while (ch == 'y' || ch == 'y') {
			System.out.println("-------product--------");
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
					System.out.println("please enter valid data");
					System.out.println("enter it again");
					choice = scanner.next();
					if (validate.idValidation(choice)) {
						break;
					}
				}
			}
			switch (Integer.parseInt(choice)) {
			case 1:

				System.out.println("Enter productid...");
				String prodid = scanner.next();
				boolean isValidId = validate.idValidation(prodid);
				while (!isValidId) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the number (range between 1-6)");
						System.out.println("enter it again");
						prodid = scanner.next();
						if (validate.idValidation(prodid)) {
							break;
						}
					}
				}
				System.out.println("Enter productname...");
				String pname = scanner.next();
				boolean isValidName = validate.nameValidation(pname);
				while (!isValidName) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the name (A-z a-z)");
						System.out.println("enter it again");
						pname = scanner.next();
						if (validate.nameValidation(pname)) {
							break;
						}
					}
				}
				System.out.println("Enter description...");
				String description = scanner.next();
				boolean isValidDescription = validate.nameValidation(description);
				while (!isValidDescription) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the name (A-Z a-z)");
						System.out.println("enter it again");
						description = scanner.next();
						if (validate.nameValidation(description)) {
							break;
						}
					}
				}

				ProductBean productBean1 = new ProductBean();
				productBean1.setProductId(Integer.parseInt(prodid));
				productBean1.setProductName(pname);
				productBean1.setDescription(description);
				try {
					boolean check = dao.insertProduct(productBean1);
					if (check) {
						System.out.println("product details added to the list");
					} else {
						System.out.println("productid is repeated");
					}
				} catch (Exception e) {
					System.out.println("Id repeated Exception");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;

			case 2:
				System.out.println("Enter productid to delete");
				try {
					int productId3 = scanner.nextInt();
					if (dao.deleteProduct(productId3)) {

						System.out.println("given productid details has been deleted");
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
				System.out.println("Enter productid to search");
				try {
					productBean.setProductId(scanner.nextInt());
					ProductBean productBean2 = dao.getProduct(productBean.getProductId());
					if (productBean2 != null) {
						System.out.println("productId:" + productBean2.getProductId());
						System.out.println("productName:" + productBean2.getProductName());
						System.out.println("product description:" + productBean2.getDescription());

					} else {
						System.out.println("product details not found....!!!");
					}
				} catch (Exception e) {
					System.out.println("Id not Found Exception");
				}

				System.out.println("do u want to countinue(y/n)");
				ch = scanner.next().charAt(0);

				break;
			case 4:
				try {
					ProductService services1 = ProductFactory.instanceOfProductServices();
					List<ProductBean> list = services1.getAllProducts();
					if (list != null) {
						for (ProductBean user : list) {
							System.out.println(user);
						}
					} else {
						System.out.println("product details not found....!!!");
					}
				} catch (Exception e) {
					System.out.println("Id not found Exception");
				}

				System.out.println("do u want to countinue(y/n)");
				ch = scanner.next().charAt(0);

				break;
			case 5:
				ProductService services = ProductFactory.instanceOfProductServices();
				System.out.println("Enter productid...");
				String productId = scanner.next();
				boolean isValidNewNo = validate.idValidation(productId);
				while (!isValidNewNo) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the number (range between 1-6)");
						System.out.println("enter it again");
						productId = scanner.next();
						if (validate.idValidation(productId)) {
							break;
						}
					}
				}
				productBean.setProductId(Integer.parseInt(productId));
				System.out.println("Enter productname to update....");
				String productName = scanner.next();
				boolean isValidNewName = validate.nameValidation(productName);
				while (!isValidNewName) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the name (A-Z a-z)");
						System.out.println("enter it again");
						productName = scanner.next();
						if (validate.nameValidation(productName)) {
							break;
						}
					}
				}
				productBean.setProductName(productName);
				try {
					if (services.updateProduct(productBean.getProductId(), productBean.getProductName())) {
						System.out.println("user updated...");
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
