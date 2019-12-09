public class Car {
	String brand;
	int showRoomPrice;
	double onRoadPrice;
	boolean isAvailable;
	char value;
	void carDetails() {
		System.out.println("brand:"+brand+" showRoomPrice:"+showRoomPrice+" onRoadPrice:"+onRoadPrice+" isAvailable:"+isAvailable+" value:"+value);
	}
	public static void main(String[] args) {
		Car c1=new Car();
		c1.carDetails();
		}

}
