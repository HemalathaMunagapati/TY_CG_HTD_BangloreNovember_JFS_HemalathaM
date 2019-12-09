package checkedexception;

public class AgeLimitException extends Exception {
	String msg="age should be more than 17";
	 public AgeLimitException(){
		
	}
	public AgeLimitException(String msg) {
		super();
		this.msg = msg;
	}
	 @Override
	public String getMessage() {
		return msg;
	}

}
