
public class TestBottle {
public static void main(String[] args) {
	Bottle b1=new Pepsi();
	b1.open();
	b1.drink();
	b1.juice();
	System.out.println("its time to relax dude");
	Bottle b2=new Fanta();
	b2.open();
	b2.drink();
	b2.juice();
	Bottle.pure();
	
}
}
