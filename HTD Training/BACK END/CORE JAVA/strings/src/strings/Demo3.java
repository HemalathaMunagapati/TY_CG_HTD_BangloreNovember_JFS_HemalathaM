package strings;

public class Demo3 {
	public static void main(String[] args) {
		String s1="Hemalatha";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(5));
		System.out.println(s1.length());
		String s2="    Me    hema  ";
		System.out.println(s2.trim());
		String s3=s1.substring(4);
		System.out.println(s3);
		System.out.println(s1.substring(2, 7));
		System.out.println(s1.indexOf('h'));
		System.out.println(s1.indexOf("latha"));
		System.out.println(s1.indexOf('h', 3));
	
	}
}
