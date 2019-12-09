package checkedexception;

public class ExceptionB {
	public static void main(String[] args) {
		System.out.println("main started");
		try {
			Class c1=Class.forName("checkedexception.Student");
			System.out.println("clas is found");
			Student s1=new Student();
			Object o1=s1.clone();
			System.out.println("successfully object is cloned");
		} catch (ClassNotFoundException e) {
			System.out.println("unable to find the class");
		} catch (CloneNotSupportedException e) {
			System.out.println("oops...!!object is not cloned");
		}
		System.out.println("main ended");
	}

}
