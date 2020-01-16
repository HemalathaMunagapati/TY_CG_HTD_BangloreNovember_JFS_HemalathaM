package com.capgemini.forestrymanagementjpahibernate.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
	public boolean idValidation(String id) {
		Pattern pattern = Pattern.compile("^[0-9]{1,6}$");
		Matcher matcher = pattern.matcher(id);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public boolean pincodeValidation(String pincode) {
		Pattern pattern = Pattern.compile("^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$");
		Matcher matcher = pattern.matcher(pincode);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public boolean nameValidation(String name) {
		Pattern pattern = Pattern.compile("^[a-zA-Z]+\\.?$");
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}


	public boolean passwordValidation(String password) {
		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,15}$");
		Matcher matcher = pattern.matcher(password);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public boolean emailValidation(String email) {
		Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public boolean phoneNumberValidation(String phoneNumber) {
		Pattern pattern = Pattern.compile("^[6-9][0-9]{9}$");
		Matcher matcher = pattern.matcher(phoneNumber);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public boolean dateValidation(String date) {
		Pattern pat = Pattern.compile("([12]\\d{3}(\\/)(0[1-9]|1[0-2])(\\/)(0[1-9]|[12]\\d|3[01]))");
		Matcher mat = pat.matcher(date);
		if (mat.matches()) {
			return true;
		} else {
			return false;
		}
	}


	public boolean dayValidation(String day) {
		Pattern pat = Pattern.compile("\\b((mon|tues|wed(nes)?|thur(s)?|fri|sat(ur)?|sun)(day)?)");
		Matcher mat = pat.matcher(day);
		if (mat.matches()) {
			return true;
		} else {
			return false;
		}
	}

}
