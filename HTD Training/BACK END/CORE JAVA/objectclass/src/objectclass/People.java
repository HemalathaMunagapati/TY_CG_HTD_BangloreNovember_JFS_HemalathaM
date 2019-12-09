package objectclass;

public class People extends Person{

	public People(String name) {
		super(name);
		
	}
	public static void main(String[] args) throws Throwable {
		Person p1=new Person("I");
		p1.finalize();
		People p=new People("me");
		p.finalize();
	}

}
