package checkedexception;

public class Paytm {
	IRCTC ic;

	public Paytm(IRCTC ic) {
		super();
		this.ic = ic;
	}
	void bookingTickets() {
		try {
			ic.confirmTicket();
			System.out.println("yahoo..ticket is booked");
		} catch (ClassNotFoundException e) {
			System.out.println(":( ticket is not booked");
			e.printStackTrace();
		}
	}

}
