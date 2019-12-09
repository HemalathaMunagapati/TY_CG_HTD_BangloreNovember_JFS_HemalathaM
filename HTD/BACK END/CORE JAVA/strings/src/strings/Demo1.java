package strings;

public class Demo1 {
	public static void main(String[] args) {
		String s1="clark";
		System.out.println("s1 hashcode value"+s1.hashCode());
		String s2="Leah";
		System.out.println("s2 hascode"+s2.hashCode());
		s1="Jadine";
		System.out.println(s1.hashCode());
		String s3="clark";

		System.out.println("s3 hashcode value"+s3.hashCode());
	}

}
