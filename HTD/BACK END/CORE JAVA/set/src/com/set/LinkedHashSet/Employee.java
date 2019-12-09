package com.set.LinkedHashSet;

public class Employee {
	String empName;
	int empId;
	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
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
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}
	

}
