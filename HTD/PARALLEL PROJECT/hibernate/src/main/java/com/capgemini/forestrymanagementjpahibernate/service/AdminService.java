package com.capgemini.forestrymanagementjpahibernate.service;

import com.capgemini.forestrymanagementjpahibernate.dto.AdminBean;

public interface AdminService {
	public boolean signup(String eMail, String password);

	public boolean login(String eMail, String password);

	public boolean addClient(String email, AdminBean bean);

	public boolean addScheduler(String email, AdminBean bean);

	public boolean deleteClient(String email);

	public boolean deleteScheduler(String email);

}
