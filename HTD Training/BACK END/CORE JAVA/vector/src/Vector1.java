import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		System.out.println(v1);
		v1.remove(new Integer(4));
		System.out.println(v1);
		v1.add(5);
		for (int j = 0; j < v1.size(); j++) {
			System.out.println(v1.get(j));	
		}
		
	}

}
