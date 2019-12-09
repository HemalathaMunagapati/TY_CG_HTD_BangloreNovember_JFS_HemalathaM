public abstract class Pizza {
String name;
static int noOfPizzas;
Pizza(String n,int no){
	this.name=n;
	noOfPizzas=no;
}
Pizza(String n){
	this.name=n;
}
}
class Margherita extends Pizza{

	Margherita(String n) {
		//super(n,no);
		super(n);
	}
	
}
