import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(2);
		l1.add(32);
		l1.add(9);
		 
		ListIterator itr=l1.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		l1.add(32);
		System.out.println(l1);
		l1.remove(new Integer(32));
		System.out.println(l1);
		l1.add(null);
		System.out.println(l1);
		System.out.println("-------------");
		for(Object o:l1) {
			System.out.println(o);
		}
		System.out.println("---------------");
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		}

}
