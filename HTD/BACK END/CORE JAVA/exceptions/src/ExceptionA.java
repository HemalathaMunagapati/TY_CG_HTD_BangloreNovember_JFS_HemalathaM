
public class ExceptionA {
	void exception(int a,String b) {
		try {
			
	
		System.out.println(500/a);
		
		System.out.println(b.length());
		}catch(ArithmeticException ae) {
			System.out.println("dont give zero for a variable");
		}
		catch(NullPointerException ae) {
			System.out.println("dont get deal with the npe");
		}
	}
	public static void main(String[] args) {
		ExceptionA a=new ExceptionA();
		a.exception(2, "hemas");
		a.exception(10, null);
		a.exception(0,"me");
	}

}
