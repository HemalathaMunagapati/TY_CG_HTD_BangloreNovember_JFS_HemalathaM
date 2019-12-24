package com.caps.empspring.dao;

import java.util.List;

import com.caps.empspring.bean.EmployeeBean;

public interface EmployeeDao {
	public EmployeeBean auth(String email,String password);
	public boolean register(EmployeeBean bean);
//	public EmployeeBean getEmployee(String email);
	public List<EmployeeBean> getAllEmployee(String key);
	public boolean changePassword(int id,String password);

}
