package in.capgemini.brokerappapi.service;

import javax.persistence.Entity;

import in.capgemini.brokerappapi.domain.Property;


public class OrderRequest {

	private Property property;

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public OrderRequest(Property property) {
		super();
		this.property = property;
	}

	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OrderRequest [property=" + property + "]";
	}
	
	
}
