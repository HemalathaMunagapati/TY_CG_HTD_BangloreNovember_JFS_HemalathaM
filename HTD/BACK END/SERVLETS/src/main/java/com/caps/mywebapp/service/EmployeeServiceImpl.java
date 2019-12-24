package com.caps.mywebapp.service;

import java.util.List;

import com.caps.mywebapp.beans.EmployeeInfoBean;
import com.caps.mywebapp.dao.EmployeeDao;
import com.caps.mywebapp.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao dao=new EmployeeDaoImpl();

	@Override
	public EmployeeInfoBean searchEmp(int empId) {
		return dao.searchEmp(empId);
	}//End of searchEmployee()

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		// TODO Auto-generated method stub
		return dao.authenticate(empId, password);
	}

	@Override
	public boolean addEmp(EmployeeInfoBean employeeInfoBean) {
		// TODO Auto-generated method stub
		return dao.addEmp(employeeInfoBean);
	}

	@Override
	public boolean deleteEmp(int empId) {
		// TODO Auto-generated method stub
		return dao.deleteEmp(empId);
	}

	@Override
	public boolean updateEmp(EmployeeInfoBean employeeInfoBean) {
		// TODO Auto-generated method stub
		return dao.updateEmp(employeeInfoBean);
	}

	@Override
	public List<EmployeeInfoBean> getAllEmp() {
		// TODO Auto-generated method stub
		return dao.getAllEmp();
	}
	

}//End of class
