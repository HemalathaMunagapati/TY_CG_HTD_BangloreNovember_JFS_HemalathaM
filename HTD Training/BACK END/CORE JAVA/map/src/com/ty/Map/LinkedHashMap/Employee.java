package com.ty.Map.LinkedHashMap;

public class Employee {
	String emName;
	int emSal;
	public Employee(String emName, int emSal) {
		super();
		this.emName = emName;
		this.emSal = emSal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emName == null) ? 0 : emName.hashCode());
		result = prime * result + emSal;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (emName == null) {
			if (other.emName != null)
				return false;
		} else if (!emName.equals(other.emName))
			return false;
		if (emSal != other.emSal)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [emName=" + emName + ", emSal=" + emSal + "]";
	}
	
	
	

}
