public class Person1 {
	int age;
	String name;
	void details()
	{
		System.out.println("Name of the person:"+name+" and age is:"+age);
	}
	void pdetails(int a,String st)
	{
		age=a;
		name=st;
		
	}
	public static void main(String[] args) {
		Person1 p1=new Person1();
		p1.age=22;
		p1.name="Hema";
		p1.details();
		Person1 p2=new Person1();
		p2.pdetails(21, "Keerthana");
		p2.details(); 
	}

}
