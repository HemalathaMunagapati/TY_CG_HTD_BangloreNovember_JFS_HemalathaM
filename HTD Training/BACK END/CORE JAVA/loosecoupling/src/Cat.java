public class Cat {
	void feed(Chips c)
	{
		c.open();
		c.eat();
	}
	public static void main(String[] args) {
		Cat c=new Cat();
		
		Chips c1=new Chips();
	
		Lays l1=new Lays();
		
		Kurkure k1=new Kurkure();
		
		Bingo b1=new Bingo();
		
		
		c.feed(c1);
	}

}
