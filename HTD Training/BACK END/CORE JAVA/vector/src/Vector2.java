import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.trimToSize();
		System.out.println(v1.size());
		v1.setSize(10);
		System.out.println(v1.size());
		System.out.println(v1);
		v1.add(2);
		System.out.println(v1.size());
		System.out.println(v1);
		v1.add(6, 50);
		System.out.println(v1);
		
		
		
		
	}

}
