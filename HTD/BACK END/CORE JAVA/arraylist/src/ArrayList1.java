import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(2);
	a1.add(3);
	a1.add(9);
	System.out.println(a1);
	a1.remove(1);
	System.out.println(a1);
	
	System.out.println("for loop");
	for (int i = 0; i < a1.size(); i++) {
		System.out.println(a1.get(i));
		
	}
	
	System.out.println("for each");
	for(Integer l:a1) {
		System.out.println(l);
	}
	
	System.out.println("Listiterator----");
	ListIterator<Integer> itr1=a1.listIterator(a1.size());
	while(itr1.hasPrevious()) {
		System.out.println(itr1.previous());
	}
	
	System.out.println("-----list iterator next method---");
	Iterator<Integer> itr=a1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	ArrayList<Integer> a2=new ArrayList();
	a2.add(33);
	a2.add(35);
	System.out.println(a2);
	a2.remove(new Integer(33));
	System.out.println(a2);
	}

}
