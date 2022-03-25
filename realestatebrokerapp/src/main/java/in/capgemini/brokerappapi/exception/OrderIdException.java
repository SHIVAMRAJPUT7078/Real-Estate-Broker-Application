package in.capgemini.brokerappapi.exception;

public class OrderIdException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public OrderIdException() {
		super();
	}
	public OrderIdException(String errMsg) {
		super(errMsg);
	}

}
