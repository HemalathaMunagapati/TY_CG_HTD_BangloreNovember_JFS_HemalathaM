public class Person {
	static int age;
	String name;
	void personDetails()
	{
		System.out.println("Name of a person is "+name+" and age is:"+age); 
		personDetailsStatic();
	}
    void personDetailsStatic()
    {
    	System.out.println("My age is true");
    }
}
