package exceptions;

public class NullPointer {
	void check() {
		String s1=null;
		try {
		System.out.println(s1.length());
		}catch(NullPointerException np) {
			System.out.println("try to initialize some value to the given string");
		}
	}
	public static void main(String[] args) {
		System.out.println("lets check the nullPointer Exception");
		NullPointer np=new NullPointer();
		np.check();
		System.out.println("oops...!!gets executed");
	}

}
