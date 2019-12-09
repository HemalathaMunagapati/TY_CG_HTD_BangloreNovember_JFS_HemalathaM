import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest1 {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(23);
		a1.add(25);
		a1.add(10);
		a1.add(8);
		a1.add(31);
		a1.add(18);
		List l1=a1.stream().filter(i ->i%2==0).collect(Collectors.toList());
		List<Integer> l2= a1.stream().filter(j ->j%2!=0).collect(Collectors.toList());
		System.out.println(l1);
		System.out.println(l2);
		
		List<Integer> l=a1.stream().map(i ->i*100).collect(Collectors.toList());
		System.out.println(l);
		
		
	Optional<Integer> a=	a1.stream().max((i,j) ->i.compareTo(j));
	System.out.println(a);
	
	System.out.println(a1.stream().count());
	System.out.println(a1.size());
	}

}
