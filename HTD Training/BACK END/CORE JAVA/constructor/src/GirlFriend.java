public class GirlFriend {
	String name;
	String CompanyName;
	double salary;
	GirlFriend(String name,String comName,double sal)
	{
		this.name=name;
		this.CompanyName=comName;
		this.salary=sal;
	}
	public static void main(String[] args) {
		GirlFriend gf=new GirlFriend("Triveni","TCS",40000);
		System.out.println(gf.name);
		System.out.println(gf.CompanyName);
		System.out.println(gf.salary);
	}

}
