
public class StringImmutable {
	public static void main(String[] args) {
		String s1=new String("Hems");
		System.out.println(s1.hashCode());
		s1=s1.concat("ammulu");
		System.out.println(s1.hashCode());
	}
}
