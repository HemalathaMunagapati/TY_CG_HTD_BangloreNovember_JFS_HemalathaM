
public class A {
	static void m() {
		try {
			B.n();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
