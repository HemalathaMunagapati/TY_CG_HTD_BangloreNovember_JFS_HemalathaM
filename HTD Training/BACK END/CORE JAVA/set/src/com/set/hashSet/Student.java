package com.set.hashSet;

public class Student {
	String stName;
	int stAge;
	public Student(String stName, int stAge) {
		super();
		this.stName = stName;
		this.stAge = stAge;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stAge;
		result = prime * result + ((stName == null) ? 0 : stName.hashCode());
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
		Student other = (Student) obj;
		if (stAge != other.stAge)
			return false;
		if (stName == null) {
			if (other.stName != null)
				return false;
		} else if (!stName.equals(other.stName))
			return false;
		return true;
	}
	
}
