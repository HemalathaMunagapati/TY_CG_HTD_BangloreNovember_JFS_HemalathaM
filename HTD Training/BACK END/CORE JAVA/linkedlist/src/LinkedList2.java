import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(34);
		l1.add(35);
		l1.add(36);
		System.out.println(l1);
		l1.addFirst(37);
		l1.addLast(38);
		l1.add(35);
		System.out.println(l1);
		System.out.println("------remove()-------");
		l1.remove();
		System.out.println(l1);
		System.out.println("-----removeFirst()------");
		l1.removeFirst();
		System.out.println(l1);
		System.out.println("-------removelast()-----");
		l1.removeLast();
		System.out.println(l1);
		
		LinkedList l2=new LinkedList();
		l2.add(44);
		l2.add(45);
		l2.add(46);
		System.out.println(l2);
		System.out.println(l2.getFirst());
		System.out.println(l2.getLast());
		l2.add(44);
		l2.add(47);
		l2.add(44);
		System.out.println(l2);
		System.out.println("----remove first occurence----");
		l2.removeFirstOccurrence(44);
		System.out.println("-----remove last occurence----");
		l2.removeLastOccurrence(44);
		System.out.println(l2);
	}

}
