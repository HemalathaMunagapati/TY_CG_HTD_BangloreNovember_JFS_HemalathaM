package CustomizedException;

public class SBIAtm {
	public static void main(String[] args) {
		System.out.println("main started");
		AtmSimulator atm=new AtmSimulator();
		try {
			atm.withdraw(41000);
		}catch(DayLimitException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("main ends");
	}

}
