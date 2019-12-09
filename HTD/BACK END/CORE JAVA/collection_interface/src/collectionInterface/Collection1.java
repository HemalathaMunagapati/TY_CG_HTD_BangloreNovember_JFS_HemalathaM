package collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1{
	

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(12);
		System.out.println(c);
		
		c.remove(12);
		System.out.println(c.size());
		System.out.println(c.contains(12));
		System.out.println(c.isEmpty());
	}

}
