
public class ExceptionC {
	public static void main(String[] args) {
		System.out.println("main started");
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			System.out.println("denominator must not be zero");
		}
		
		finally {
			System.out.println("aagaya finally:)))");
		System.out.println("main ended");
	}
	}

}
