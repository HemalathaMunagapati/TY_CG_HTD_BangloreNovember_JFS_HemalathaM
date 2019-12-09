public class Calculator {
	final void add(int a,int b)
	{
		System.out.println(a+b);
	}

}
class TestCalculator extends Calculator{
	//void add(int a,int b)
	{
		System.out.println("cannot be ovverided");
	}//
	
	
}
