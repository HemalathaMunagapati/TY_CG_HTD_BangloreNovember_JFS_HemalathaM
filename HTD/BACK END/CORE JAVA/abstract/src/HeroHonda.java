public abstract class HeroHonda {
	abstract void design();
	abstract void engine();

}
abstract class Honda extends HeroHonda{
	void engine()
	{
		System.out.println("Hero Honda Engine gives good milage");
	}
}
class Hero extends HeroHonda{

	@Override
	void design() {
		System.out.println("Design the herohonda bike");
		
	}

	@Override
	void engine() {
		System.out.println("Hero bike engine is under control");
		
	}
	
}
