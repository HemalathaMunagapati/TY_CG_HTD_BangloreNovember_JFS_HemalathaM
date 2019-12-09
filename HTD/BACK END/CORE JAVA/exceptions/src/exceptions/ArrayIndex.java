package exceptions;

public class ArrayIndex {
	public static void main(String[] args) {
		System.out.println("main started");
		int a[]=new int[4];
		a[0]=1;
		a[1]=10;
		a[2]=100;
		a[3]=1;
		try {
		a[4]=1;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("stack overflow");
		}
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("main ended");
		
	}

}
