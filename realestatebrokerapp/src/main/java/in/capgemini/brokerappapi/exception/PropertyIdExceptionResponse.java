package in.capgemini.brokerappapi.exception;

public class PropertyIdExceptionResponse{
	private String propertyIdentifier;

	public PropertyIdExceptionResponse(String propertyIdentifier) {
		super();
		this.propertyIdentifier = propertyIdentifier;
	}

	public String getPropertyIdentifier() {
		return propertyIdentifier;
	}

	public void setPropertyIdentifier(String propertyIdentifier) {
		this.propertyIdentifier =propertyIdentifier;
	}
	
	

}
