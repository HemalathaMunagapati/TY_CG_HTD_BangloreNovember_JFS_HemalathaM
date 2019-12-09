package com.ty.Queue.PriorityQueue;

public class Student implements Comparable<Student>{
	String stName;
	int stAge;
	

	public Student(String stName, int stAge) {
		super();
		this.stName = stName;
		this.stAge = stAge;
	}


	@Override
	public int compareTo(Student o) {
		if(this.stAge>o.stAge) {
			return 1;
			
		}else if(this.stAge<o.stAge){
			return -1;
		}
		else
			return 0;
	}


	@Override
	public String toString() {
		return "Student [stName=" + stName + ", stAge=" + stAge + "]";
	}

}
