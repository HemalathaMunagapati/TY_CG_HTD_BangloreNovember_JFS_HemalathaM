package CustomizedException;

public class AtmSimulator {
	void withdraw(double amnt) {
		if(amnt>40000) {
			throw new DayLimitException();
		}
	}

}
