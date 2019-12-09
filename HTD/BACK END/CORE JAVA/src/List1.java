import java.util.List;
import java.util.ArrayList;

public class List1 {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(12);
		l.add(45);
		System.out.println(l);
		l.add(1, 55);
		System.out.println(l);
		
		List l1=new ArrayList();
		l1.add(9);
		l1.add(90);
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
		
		List l2=new ArrayList();
		l2.add(9);
		l2.add(90);
		System.out.println(l2.indexOf(9));
		
		List l3=new ArrayList();
		l3.add(79);
		l3.add(900);
		l3.add(79);
		System.out.println(l3.lastIndexOf(79));
		
		List l4=new ArrayList();
		l4.add(4);
		l4.add(40);
		System.out.println(l4.get(1));
		
		List l5=new ArrayList();
		l5.add(89);
		l5.add(88);
		l5.addAll(1, l3);
		System.out.println(l5);

		List l6=new ArrayList();
		l6.add(9);
		l6.add(3);
		l6.set(1, 31);
		System.out.println(l6);
		
		List l7=new ArrayList();
	      
	       l7=l3.subList(0,2);
	       System.out.println(l7);
	
	
	}

}
