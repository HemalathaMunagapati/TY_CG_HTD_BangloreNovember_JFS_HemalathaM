
public class TestPrivate {
	public static void main(String[] args) {
		//Private p=new Private();(cant create an object of an private constructor)
		Private p1=new Private(9);
		//its not possible to acess private variables and methods outside of the class
		//System.out.println(p1.num);
		//p1.isPrivate();
		
	}

}
