   package objectclass;

public class TestDog {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Dog d1=new Dog("pinky");
		Class c1=d1.getClass();
		System.out.println(c1);
		Dog d2=(Dog)c1.newInstance();
		d2.name="me";
		System.out.println(d2.name);
		Class c2=Class.forName("IceCream");
		System.out.println(c2);
	}

}
