import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(2);
		v1.addElement(3);
		v1.addElement(6);
		v1.addElement(9);
		System.out.println(v1);
		v1.removeElement(new Integer(3));
		System.out.println(v1);
		v1.removeElementAt(2);
		System.out.println(v1);
		Object o[]=new Object[v1.size()];
		v1.copyInto(o);
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
		v1.removeAllElements();
		System.out.println(v1);


		Vector v2=new Vector();
		v2.add(20);
		v2.addElement(30);

		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.trimToSize();
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.ensureCapacity(6);
		v2.setSize(8);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println(v2);
	}

}
