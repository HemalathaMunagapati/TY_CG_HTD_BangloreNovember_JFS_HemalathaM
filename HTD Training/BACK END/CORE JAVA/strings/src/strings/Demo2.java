package strings;

public class Demo2 {
	public static void main(String[] args) {
		String s1=new String("Basti");
		System.out.println(s1.hashCode());
		String s2=new String("Iris");
		String s3=new String("Basti");
		s2=new String("Jadine");                 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
