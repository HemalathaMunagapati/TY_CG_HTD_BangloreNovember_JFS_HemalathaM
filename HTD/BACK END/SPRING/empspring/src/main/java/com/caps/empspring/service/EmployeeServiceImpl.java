package com.caps.empspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.caps.empspring.bean.EmployeeAddressBean;
import com.caps.empspring.bean.EmployeeBean;
import com.caps.empspring.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
	@Autowired
	private EmployeeDao dao;

	@Override
	public EmployeeBean auth(String email, String password) {
		// TODO Auto-generated method stub
		return dao.auth(email, password);
	}

	@Override
	public boolean register(EmployeeBean bean) {
		List<EmployeeAddressBean> address=bean.getAddressBeans();
		String encodedPassword=encoder.encode(bean.getPassword());
		bean.setPassword(encodedPassword);
		for (EmployeeAddressBean addressBean:address) {
			addressBean.setBean(bean);
		}
		return dao.register(bean);
	}

	@Override
	public List<EmployeeBean> getAllEmployee(String key) {
		// TODO Auto-generated method stub
		return dao.getAllEmployee(key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(id, encoder.encode(password));
	}



}
