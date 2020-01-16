package com.capgemini.forestrymanagementjpahibernate.dao;

import java.util.List;

import com.capgemini.forestrymanagementjpahibernate.dto.HaulierBean;

public interface HaulierDao {
	public List<HaulierBean> getAllHauliers();

	public HaulierBean getHaulier(int haulierId);

	public boolean insertHaulier(HaulierBean user);

	boolean deleteHaulier(int haulierId);

	public boolean updateHaulier(int haulierId, String haulierName);

}
