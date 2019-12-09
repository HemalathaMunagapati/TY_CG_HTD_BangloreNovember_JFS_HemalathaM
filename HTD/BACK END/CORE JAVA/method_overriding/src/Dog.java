public class Dog extends Animal{
void eat() {
	System.out.println("Dog is eating");
}
public static void main(String[] args) {
	Dog d1=new Dog();
	d1.eat();
	Lion l1=new Lion();
	l1.eat();
	Animal a1=new Dog();
	a1.eat();
	Animal a2=new Lion();
	a2.eat();
	
}
}
