
public interface Check extends Bottle{
	public default void juice() {
		System.out.println("extended default method");
	}

}

