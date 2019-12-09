package exceptions;

public class ArithmeticException {
	void divide(int a,int b) {
		System.out.println("divide method called");
		try {
		System.out.println(a/b);
		}catch(Exception ae) {
			System.out.println("the value of b must not be zero");
		}
		System.out.println("divided successfully");
	}
	public static void main(String[] args) {
		System.out.println("main method starts");
		ArithmeticException ae=new ArithmeticException();
		ae.divide(10, 0);
		System.out.println("main method ends");
	}

}
