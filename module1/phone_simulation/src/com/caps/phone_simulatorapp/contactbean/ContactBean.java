package com.caps.phone_simulatorapp.contactbean;

public class ContactBean {
	private String contactname;
	private int phno;
	private String group;
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getGroup() {
		return group;
	}
	@Override
	public String toString() {
		return "ContactBean [contactname=" + contactname + ", phno=" + phno + ", group=" + group + "]";
	}
	public void setGroup(String group) {
		this.group = group;
	}

}
