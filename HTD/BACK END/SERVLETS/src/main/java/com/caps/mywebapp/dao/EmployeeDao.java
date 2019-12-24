package com.caps.mywebapp.dao;

import java.util.List;

import com.caps.mywebapp.beans.EmployeeInfoBean;

public interface EmployeeDao {
	public EmployeeInfoBean searchEmp(int empId);
	public  EmployeeInfoBean authenticate(int empId,String password);
	public boolean addEmp( EmployeeInfoBean employeeInfoBean);
	public boolean deleteEmp( int empId);
	public boolean updateEmp( EmployeeInfoBean employeeInfoBean);
	public List<EmployeeInfoBean> getAllEmp();
	
}//End of dao
