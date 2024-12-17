//write user defined exception invalid balance exception
public class InvalidBalanceException extends RuntimeException {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public InvalidBalanceException(String message) {
		super();
		this.message = message;
	}

	public InvalidBalanceException() {
		message = "The balance is not sufficient. ";
	}

	@Override
	public String toString() {
		return "InvalidBalanceException [message=" + message + "]";
	}
	
	
}
