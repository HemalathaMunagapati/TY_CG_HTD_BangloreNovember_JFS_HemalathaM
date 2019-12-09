package CustomizedException;

public class DayLimitException extends RuntimeException {
	String msg="exceeds provided limit";
	public DayLimitException() {
		super();
	}

	public DayLimitException(String msg) {
		
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}
	

}
