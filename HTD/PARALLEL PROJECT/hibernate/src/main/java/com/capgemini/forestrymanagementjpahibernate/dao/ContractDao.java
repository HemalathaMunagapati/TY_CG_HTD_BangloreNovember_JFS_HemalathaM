package com.capgemini.forestrymanagementjpahibernate.dao;

import java.util.List;

import com.capgemini.forestrymanagementjpahibernate.dto.ContractBean;

public interface ContractDao {
	public List<ContractBean> getAllContracts();

	public ContractBean getContracter(int contractNo);

	public boolean insertContracter(ContractBean user);

	boolean deleteContract(int contractNo);

	public boolean updateContract(int contractNo, String deliveryDate);

}
