package com.capgemini.forestrymanagementjpahibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementjpahibernate.dao.OrderDao;
import com.capgemini.forestrymanagementjpahibernate.dto.OrderBean;
import com.capgemini.forestrymanagementjpahibernate.exceptions.ValidationException;
import com.capgemini.forestrymanagementjpahibernate.factory.OrderFactory;
import com.capgemini.forestrymanagementjpahibernate.service.OrderService;
import com.capgemini.forestrymanagementjpahibernate.validations.Validations;

public class Order {

	@SuppressWarnings("resource")
	public static void order() {
		OrderBean orderBean = new OrderBean();
		Validations validate = new Validations();
		OrderDao dao = OrderFactory.instanceOfOrderDaoImpl();
		Scanner scanner = new Scanner(System.in);
		char ch = 'y';
		while (ch == 'y' || ch == 'y') {
			System.out.println("-------order--------");
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
					System.out.println("please enter any data");
					System.out.println("enter it again");
					choice = scanner.next();
					if (validate.idValidation(choice)) {
						break;
					}
				}
			}
			switch (Integer.parseInt(choice)) {
			case 1:
				System.out.println("Enter orderNo..");
				String orderNo = scanner.next();
				boolean isValidNo = validate.idValidation(orderNo);
				while (!isValidNo) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the number (range between 1-6)");
						System.out.println("enter it again");
						orderNo = scanner.next();
						if (validate.idValidation(orderNo)) {
							break;
						}
					}
				}
				System.out.println("Enter customeId..");
				String customerId = scanner.next();
				boolean isValidId = validate.idValidation(customerId);
				while (!isValidId) {
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
				System.out.println("Enter delivery date...");
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
				System.out.println("Enter delivery day...");
				String deliveryDay = scanner.next();
				boolean isValidDay = validate.dayValidation(deliveryDay);
				while (!isValidDay) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter valid day{ex:sun or sunday}");
						System.out.println("enter it again");
						deliveryDay = scanner.next();
						if (validate.dayValidation(deliveryDay)) {
							break;
						}
					}
				}
				System.out.println("Enter haulierId..");
				String haulierId = scanner.next();
				boolean isValidHid = validate.idValidation(haulierId);
				while (!isValidHid) {
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
				System.out.println("Enter productId..");
				String productId = scanner.next();
				boolean isValidPid = validate.idValidation(productId);
				while (!isValidPid) {
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

				OrderBean orderBean1 = new OrderBean();
				orderBean1.setOrderNo(Integer.parseInt(orderNo));
				orderBean1.setCustomerId(Integer.parseInt(customerId));
				orderBean1.setProductId(Integer.parseInt(productId));
				orderBean1.setHaulierId(Integer.parseInt(haulierId));
				orderBean1.setDeliveryDate(deliveryDate);
				orderBean1.setDeliveryDay(deliveryDay);

				try {
					boolean check = dao.insertOrder(orderBean1);
					if (check) {
						System.out.println("order details added to the list");
					} else {
						System.out.println("orderNo is repeated");
					}
				} catch (Exception e) {
					System.out.println("Id repeated Exception");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);
				break;
			case 2:
				System.out.println("Enter orderno to delete");
				try {
					int orderNo3 = scanner.nextInt();
					if (dao.deleteOrder(orderNo3)) {

						System.out.println("given orderno details has been deleted");
					} else {
						System.out.println("sorry....Unable to deleted");
					}
				} catch (Exception e) {
					System.out.println("Id not Found Exception");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch = scanner.next().charAt(0);

				break;
			case 3:
				System.out.println("Enter orderno to search");
				try {
					orderBean.setOrderNo(scanner.nextInt());
					OrderBean orderBean2 = dao.getOrder(orderBean.getOrderNo());
					if (orderBean2 != null) {
						System.out.println("orderno:" + orderBean2.getOrderNo());
						System.out.println("customerId:" + orderBean2.getCustomerId());
						System.out.println("haulierId:" + orderBean2.getHaulierId());
						System.out.println("productId:" + orderBean2.getProductId());
						System.out.println("deliveryDay:" + orderBean2.getDeliveryDay());
						System.out.println("deliverydate:" + orderBean2.getDeliveryDate());
					} else {
						System.out.println(" given orderno details not found....!!!");
					}
				} catch (Exception e) {
					System.out.println("Id not Found Exception");
				}

				System.out.println("do u want to countinue(y/n)");
				ch = scanner.next().charAt(0);

				break;
			case 4:
				try {
					OrderService services = OrderFactory.instanceOfOrderServices();
					List<OrderBean> list = services.getAllOrders();
					if (list != null) {
						for (OrderBean user : list) {
							System.out.println(user);
						}
					} else {
						System.out.println("orderno details not found....!!!");
					}
				} catch (Exception e) {
					System.out.println("Id not found Exception");
				}

				System.out.println("do u want to countinue(y/n)");
				ch = scanner.next().charAt(0);

				break;
			case 5:
				OrderService service = OrderFactory.instanceOfOrderServices();
				System.out.println("Enter orderno...");
				String orderNo1 = scanner.next();
				boolean isValidNewNo = validate.idValidation(orderNo1);
				while (!isValidNewNo) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter  the number (range between 1-6)");
						System.out.println("enter it again");
						orderNo1 = scanner.next();
						if (validate.idValidation(orderNo1)) {
							break;
						}
					}
				}
				orderBean.setOrderNo(Integer.parseInt(orderNo1));
				System.out.println("Enter deliveryday to update..");
				String newDeliveryDay = scanner.next();
				boolean isValidNewDay = validate.dayValidation(newDeliveryDay);
				while (!isValidNewDay) {
					try {
						throw new ValidationException();
					} catch (ValidationException e1) {
						System.out.println("please enter valid days(ex:sun or sunday)");
						System.out.println("enter it again");
						newDeliveryDay = scanner.next();
						if (validate.dayValidation(newDeliveryDay)) {
							break;
						}
					}
				}
				orderBean.setDeliveryDay(newDeliveryDay);
				try {
					if (service.updateOrder(orderBean.getOrderNo(), orderBean.getDeliveryDay())) {
						System.out.println("order details updated");
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
