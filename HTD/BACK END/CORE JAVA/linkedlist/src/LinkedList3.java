import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(23);
		l1.add(24);
		l1.add(25);
		l1.add(26);
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		System.out.println("-------poll pollfirst and polllast---");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
		System.out.println(l1);
		System.out.println(l1.pollLast());
		System.out.println(l1);
		System.out.println("-----offer offerFirst and offerLast---");
		LinkedList l2=new LinkedList();
		l2.add(12);
		l2.add(13);
		l2.add(14);
		l2.add(15);
		System.out.println(l2);
		l2.offer(16);
		System.out.println(l2);
		l2.offerFirst(17);
		System.out.println(l2);
		l2.offerLast(18);
		System.out.println(l2);
	}

}
