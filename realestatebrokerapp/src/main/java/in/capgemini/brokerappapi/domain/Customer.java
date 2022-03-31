package in.capgemini.brokerappapi.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import in.capgemini.brokerappapi.reauest.EmployeeRequest;


/**
 * @author hsraj
 *
 */


@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "customerIdentifier is required")
	@Column(updatable = false , unique = true)
	private String customerIdentifier;
	@NotBlank(message = "customerFirstName is required")
	private String customerFirstName;
	private String customerLastName;
	private String email;
	@OneToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;
	@OneToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	@JoinColumn(name = "property_id")
	private Property property;
	
	
	
	

	public Property getProperty() {
		return property;
	}


	public void setProperty(Property property) {
		this.property = property;
	}


	public Customer() {
		super();
		
	}


	public Customer(EmployeeRequest employeeRequest) {
		this.customerIdentifier = employeeRequest.getCustomerIdentifier();
		this.customerFirstName = employeeRequest.getCustomerFirstName();
		this.customerLastName = employeeRequest.getCustomerLastName();
		this.email = employeeRequest.getEmail();

	}
//	@OneToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
//	private Address address;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	private List<Order> custOrder;
//	private Cart custCart;

	/*
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Order> getCustOrder() {
		return custOrder;
	}
	public void setCustOrder(List<Order> custOrder) {
		this.custOrder = custOrder;
	}
	public Cart getCustCart() {
		return custCart;
	}
	public void setCustCart(Cart custCart) {
		this.custCart = custCart;
	}*/
	
	







