import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicteTest {
	public static void main(String[] args) {
		System.out.println("------------------predicate test-----------");
		Predicate<Integer> p=i ->i%2== 0;
		boolean b=p.test(12);
		System.out.println(b);
		System.out.println(p.test(35));
		
		
		System.out.println("----function test-----");
		Function<Integer, Integer> f=i ->i*35;
		int a=f.apply(3);
		System.out.println(a);
		System.out.println(f.apply(2));
		
		System.out.println("----supplier-------");
	    Supplier<Person> s =() ->new Person(22,"hemalatha");
	    System.out.println(s.get().getAge());
	    System.out.println(s.get().getName());
	    
	    System.out.println("---------------consumer-------------");
	    Consumer<Person> c=j ->{
	    	System.out.println(j.getAge());
	    	System.out.println(j.getName());
	    };
	    Person p1=new Person(21,"keerthana");
	    c.accept(p1);
		
	}

}
