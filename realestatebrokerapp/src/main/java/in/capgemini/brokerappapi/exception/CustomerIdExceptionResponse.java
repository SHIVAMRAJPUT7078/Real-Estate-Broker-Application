package in.capgemini.brokerappapi.exception;

public class CustomerIdExceptionResponse {

	private String custId;

	public CustomerIdExceptionResponse(String custId) {
		super();
		this.custId = custId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}
	
}
