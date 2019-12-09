package customChecked;

public class AgeLimitException extends Exception {
	String msg = "Age should be more than 18";
	public AgeLimitException() {
		// TODO Auto-generated constructor stub
	}
	public AgeLimitException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage() {
		return this.msg;
	}
}
