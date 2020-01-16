package com.capgemini.forestrymanagementjpahibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Haulier")
public class HaulierBean {
	@Column
	@Id
	private int haulierId;
	@Column
	private String haulierName;
	@Column
	private String streetAddress1;
	@Column
	private String streetAddress2;
	@Column
	private String town;
	@Column
	private int postalCode;
	@Column
	private String email;

	public int getHaulierId() {
		return haulierId;
	}

	public void setHaulierId(int haulierId) {
		this.haulierId = haulierId;
	}

	public String getHaulierName() {
		return haulierName;
	}

	public void setHaulierName(String haulierName) {
		this.haulierName = haulierName;
	}

	public String getStreetAddress1() {
		return streetAddress1;
	}

	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "haulierId=" + haulierId + ", haulierName=" + haulierName + ", streetAddress1=" + streetAddress1
				+ ", streetAddress2=" + streetAddress2 + ", town=" + town + ", postalCode=" + postalCode + ", email="
				+ email;
	}

}
