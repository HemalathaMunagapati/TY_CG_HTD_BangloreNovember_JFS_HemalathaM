package checkedexception;

public class IRCTC {
	void confirmTicket() throws ClassNotFoundException {
		try {
			Class.forName("checkedexception.Paytm");
			System.out.println("ticket is confirmed");
		} catch (ClassNotFoundException e) {
			System.out.println("ticket is not confirmed");
			e.printStackTrace();
			throw e;
		}
	}

}
