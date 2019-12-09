package array;

public class Array3 {
	public static void main(String[] args) {
		char c[]=new char[4];
		c[0]='h';
		c[1]='e';
		c[2]='m';
		c[3]=1 ;
		System.out.println(c.length);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
