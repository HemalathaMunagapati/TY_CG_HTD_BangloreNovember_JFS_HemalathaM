package com.capgemini.forestrymanagementjpahibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementjpahibernate.dao.ContractDao;
import com.capgemini.forestrymanagementjpahibernate.dao.ContractDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.dto.ContractBean;

public class ContractServiceImpl implements ContractService {
	ContractDao dao = new ContractDaoImpl();

	public List<ContractBean> getAllContracts() {
		return dao.getAllContracts();
	}

	public ContractBean getContracter(int contractNo) {
		return dao.getContracter(contractNo);
	}

	public boolean insertContracter(ContractBean user) {
		return dao.insertContracter(user);
	}

	public boolean deleteContract(int contractNo) {
		return dao.deleteContract(contractNo);
	}

	public boolean updateContract(int contractNo, String deliveryDate) {
		return dao.updateContract(contractNo, deliveryDate);
	}


}
