
public class ExceptionB {
	void exception(int a,String b) {
		try {
			System.out.println(a/5);
			try {
				System.out.println(5/a);
			}catch(NullPointerException ae) {
				System.out.println("given value must not be zero");
			}
		}catch(ArithmeticException e) {
			System.out.println("given value must not be zero");
		}
		
		
	}
	public static void main(String[] args) {
		ExceptionB e=new ExceptionB();
		e.exception(10, null);
		e.exception(0, "hem");
	}

}
