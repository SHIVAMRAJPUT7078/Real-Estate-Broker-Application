package in.capgemini.brokerappapi.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author hsraj
 *
 */
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long custId;
	private String firstName;
	private String lastName;
	private Address address;
	private String email;
	private List<Order> custOrder;
	private Cart custCart;
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
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
	}
	
	
}
