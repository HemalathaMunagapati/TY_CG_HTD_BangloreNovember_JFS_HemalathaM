package checkedexception;

public class ExceptionC {
	public static void main(String[] args) {
		System.out.println("main started");
		Employee e1=new Employee();
		try {
			Class c1=Class.forName("checkedexception.Employee");
			System.out.println("class is found");
			try {
				Object o1=e1.clone();
				System.out.println("object is cloned");
			} catch (CloneNotSupportedException e) {
				System.out.println("clone is not supporting");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("class is not found");
		}
		System.out.println("main ended");
		
		
	}

}
