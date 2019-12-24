package com.caps.mywebapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.caps.mywebapp.beans.EmployeeInfoBean;

public class EmployeeDaoImpl implements EmployeeDao{
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
//	private  EmployeeDaoImpl() {
//
//	}
	@Override
	public EmployeeInfoBean searchEmp(int empId) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EmployeeInfoBean employeeInfoBean=entityManager.find(EmployeeInfoBean.class, empId);
		entityManager.close();

		return employeeInfoBean;
	}//End of searchEmployee()
	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		EntityManager manager=entityManagerFactory.createEntityManager();
		String jpql="from EmployeeInfoBean where empId=:empId and password=:pwd";
		Query query=manager.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("pwd", password);
		EmployeeInfoBean employeeInfoBean=null;
		try {
			 employeeInfoBean=(EmployeeInfoBean)query.getSingleResult();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return employeeInfoBean;
	}
	@Override
	public boolean addEmp(EmployeeInfoBean employeeInfoBean) {
		boolean isAdded=false;
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=null;
		try {
			

				transaction=manager.getTransaction();
				transaction.begin();
				manager.persist(employeeInfoBean);
				transaction.commit();
				isAdded=true;
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	return isAdded;
		
	}
	@Override
	public boolean deleteEmp(int empId) {
		boolean isDeleted=false;
		EntityManager manager=entityManagerFactory.createEntityManager();
		EmployeeInfoBean employeeInfoBean=manager.find(EmployeeInfoBean.class, empId);
		EntityTransaction transaction=null;
		if(employeeInfoBean!=null) {
			transaction=manager.getTransaction();
			transaction.begin();
			manager.remove(employeeInfoBean);
			transaction.commit();
			isDeleted=true;
		}
		manager.close();
		return isDeleted;
	}//End of deleteEmployee()
	
	
	@Override
	public boolean updateEmp(EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated=false;
		EntityManager manager=entityManagerFactory.createEntityManager();
		EmployeeInfoBean existingEmployeeInfo=manager.find(EmployeeInfoBean.class, employeeInfoBean);
		EntityTransaction transaction=manager.getTransaction();
		if(existingEmployeeInfo!=null) {
			try {
				transaction.begin();
				String newName=employeeInfoBean.getEName().trim();
				if(newName!=null && !newName.isEmpty()) {
					existingEmployeeInfo.setEName(newName);
				}
				int newAge=employeeInfoBean.getAge();
				if(newAge>18) {
					existingEmployeeInfo.setAge(newAge);
				}
				double newSalary=employeeInfoBean.getSalary();
				if(newSalary>0) {
					existingEmployeeInfo.setSalary(newSalary);
				}
				String newDesignation=employeeInfoBean.getDesignation();
				if(newDesignation!=null && !newDesignation.isEmpty()) {
					existingEmployeeInfo.setDesignation(newDesignation);
				}
				String newPassword=employeeInfoBean.getPassword().trim();
				if(newPassword!=null && !newPassword.isEmpty()) {
					existingEmployeeInfo.setPassword(newPassword);
				}
				transaction.commit();
				isUpdated=true;
			}catch (Exception e) {
				e.printStackTrace();
			}
		}//End of Outer If
		manager.close();
		return isUpdated;
	}//End of updateEmployee()
	@Override
	public List<EmployeeInfoBean> getAllEmp() {
		EntityManager manager=entityManagerFactory.createEntityManager();
		String jpql="from EmployeeInfoBean";
		Query query=manager.createQuery(jpql);
		List<EmployeeInfoBean> employeeList=query.getResultList();
		manager.close();

		return employeeList;
	}//end of getAllEmp()
	

}//End of class
