      package objectclass;

public class TestVehicle {
	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle v=new Vehicle("Maruti Suzuki");
		Object o1=v.clone();
		Vehicle v2=(Vehicle)o1;
		System.out.println(v2.vName);
	}

}
