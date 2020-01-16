package com.capgemini.forestrymanagementjpahibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementjpahibernate.dto.ContractBean;

public interface ContractService {

	public List<ContractBean> getAllContracts();

	public ContractBean getContracter(int contractNo);

	public boolean insertContracter(ContractBean user);

	boolean deleteContract(int contractNo);

	public boolean updateContract(int contractNo, String deliveryDate);
}
