 package objectclass;

public class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method gets started");
	}
	public static void main(String[] args) throws Throwable {
		System.out.println("main method starts");
		Person p1=new Person("HEma");
		
		p1.finalize();
		System.out.println(p1.name);
		p1=null;
		System.gc();
		
		System.out.println("Main method ends");
	}

}
