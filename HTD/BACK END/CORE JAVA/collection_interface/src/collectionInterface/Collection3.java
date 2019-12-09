package collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(12);
		c.add(13);
		Collection c1=new ArrayList();
		c1.add(14);
		c1.add(15);
		System.out.println("add all--------");
		System.out.println(c);
		c.addAll(c1);
		System.out.println(c);
		System.out.println("remove alll------");
		
		Collection c2=new ArrayList();
		c2.remove(14);
		c2.remove(15);
		
		System.out.println(c2);
		c.removeAll(c1);
		System.out.println(c);
		System.out.println("retainsAll-----");
		Collection c4=new ArrayList();
		c4.add(12);
		c4.add(13);
		Collection c5=new ArrayList();
		c5.add(c4);
		System.out.println(c4);
		c4.retainAll(c);
		System.out.println(c4);
		System.out.println(c2);
		System.out.println("containsAll----------");
		System.out.println(c4.containsAll(c));
		System.out.println("clear-------- ");
		c4.clear();
		System.out.println(c4);
		System.out.println("toArray()-------");
		Collection c6=new ArrayList();
		c6.add(12);
		c6.add(13);
		Object o[]=c6.toArray();
		for (int i = 0; i <o.length; i++) {
			System.out.println(o[i]);
		}
	}

}
