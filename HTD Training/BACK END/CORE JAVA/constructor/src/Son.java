public class Son extends Father {
Son()
{
	super("laksmaiah",48);
	System.out.println("c");
}
Son(String name,int age){
	this();
	System.out.println("D");
}
public static void main(String[] args) {
	Son s1=new Son("sriram",24);
	
}
}

