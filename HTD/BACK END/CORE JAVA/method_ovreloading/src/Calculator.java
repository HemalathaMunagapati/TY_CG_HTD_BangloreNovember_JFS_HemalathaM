public class Calculator {
int add(int a)
{
	return a+a;
}
int add(int a,int b)
{
	return a+b;
}
double add(double a)
{
	return a+a;
}
static void mul(int a)
{
	System.out.println("Multiplication:"+(a*a));
}
static void mul(int a,double b)
{
	System.out.println("Multiplication m1:"+(a*b));
}
static void mul()
{
	System.out.println("Wowww..!!Multiplicsation is done");
}
public static void main(String[] args) {
	Calculator c1=new Calculator();
	int r1=c1.add(5);
	System.out.println("Result r1="+r1);
	int r2=c1.add(5,9);
	System.out.println("Result r2="+r2);
	double d1=c1.add(3.45);
	System.out.println("Result r3="+d1);
	Calculator.mul(9);
	Calculator.mul(2, 4.0);
	Calculator.mul();
}
	
}
