
public class Car {
	Vehicle v1=(a,b)->{
		System.out.println("car name is "+a+" car no is "+b);
		
	};
	public static void main(String[] args) {
		Car c1=new Car();
		c1.v1.move("ferrari",8635);
	}

}
