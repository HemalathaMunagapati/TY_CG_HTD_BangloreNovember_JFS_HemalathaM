package checkedexception;

public class A {
	public static void main(String[] args) {
		System.out.println("main started");
		try {
			B.m();
			System.out.println("given class is found");
		} catch (ClassNotFoundException e) {
			System.out.println("class is not found");
			e.printStackTrace();
		}
		System.out.println("main ended");
	}

}
