package objectclass;

public class Student {
	String stname;
	int stno;
	public Student(String stname, int stno) {
		super();
		this.stname = stname;
		this.stno = stno;
	}
	@Override
	public String toString() {
		return "Student [stname=" + stname + ", stno=" + stno + "]";
	}
	

}
