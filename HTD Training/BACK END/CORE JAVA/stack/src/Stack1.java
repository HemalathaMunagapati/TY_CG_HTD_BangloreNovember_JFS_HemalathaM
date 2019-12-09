import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		System.out.println(s1);
		s1.push(33);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.search(2));
	}
}
