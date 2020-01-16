package com.capgemini.forestrymanagementjpahibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementjpahibernate.dao.HaulierDao;
import com.capgemini.forestrymanagementjpahibernate.dao.HaulierDaoImpl;
import com.capgemini.forestrymanagementjpahibernate.dto.HaulierBean;

public class HaulierServiceImpl implements HaulierService {
	HaulierDao dao = new HaulierDaoImpl();

	public List<HaulierBean> getAllHauliers() {
		return dao.getAllHauliers();
	}

	public HaulierBean getHaulier(int haulierId) {
		return dao.getHaulier(haulierId);
	}

	public boolean insertHaulier(HaulierBean user) {
		return dao.insertHaulier(user);
	}

	public boolean deleteHaulier(int haulierId) {
		return dao.deleteHaulier(haulierId);
	}

	public boolean updateHaulier(int haulierId, String haulierName) {
		return dao.updateHaulier(haulierId, haulierName);
	}

}
