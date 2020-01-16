package com.capgemini.forestrymanagementjpahibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementjpahibernate.dto.HaulierBean;

public interface HaulierService {
	public List<HaulierBean> getAllHauliers();

	public HaulierBean getHaulier(int haulierId);

	public boolean insertHaulier(HaulierBean user);

	boolean deleteHaulier(int haulierId);

	public boolean updateHaulier(int haulierId, String haulierName);

}
