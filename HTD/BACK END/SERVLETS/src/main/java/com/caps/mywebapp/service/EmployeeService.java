package com.caps.mywebapp.service;

import java.util.List;

import com.caps.mywebapp.beans.EmployeeInfoBean;

public interface EmployeeService {
	
	public EmployeeInfoBean searchEmp(int empId);
	public  EmployeeInfoBean authenticate(int empId,String password);
	public boolean addEmp( EmployeeInfoBean employeeInfoBean);
	public boolean deleteEmp( int empId);
	public boolean updateEmp( EmployeeInfoBean employeeInfoBean);
	public List<EmployeeInfoBean> getAllEmp();


}//End of service
