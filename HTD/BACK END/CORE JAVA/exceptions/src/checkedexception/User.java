package checkedexception;

public class User {
public static void main(String[] args) {
	System.out.println("successfully login to the page");
	IRCTC i=new IRCTC();
	Paytm p=new Paytm(i);
	p.bookingTickets();
	System.out.println("please like the page ");
	
}
}
