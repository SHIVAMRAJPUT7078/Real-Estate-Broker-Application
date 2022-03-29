package in.capgemini.brokerappapi.reauest;

import in.capgemini.brokerappapi.domain.Address;

public class EmployeeRequest {

	private String customerIdentifier;
	private String customerFirstName;
	private String customerLastName;
	private String email;
	private Address  address;
	public String getCustomerIdentifier() {
		return customerIdentifier;
	}
	public void setCustomerIdentifier(String customerIdentifier) {
		this.customerIdentifier = customerIdentifier;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
