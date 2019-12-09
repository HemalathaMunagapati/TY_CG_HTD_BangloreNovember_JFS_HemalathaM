public abstract class Vehicle {
	void start()
	{
		System.out.println("Start the car");
	}
	abstract void stop();

}
class Car extends Vehicle{
	@Override
	void stop() {
		System.out.println("stop the car");
		
	}
}