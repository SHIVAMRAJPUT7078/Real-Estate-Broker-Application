
package in.capgemini.brokerappapi.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Property {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long propertyId;
	@NotBlank(message="propertyName is required")
	
	private String propertyName;
	@NotBlank(message="propertyIdentifier is required")
	@Column(updatable=false,unique=true)
	@Size(min=4,max=5,message="Please use 4 to 5 characters only")
	private String propertyIdentifier;
	private int price;
	private String color;
	private String dimension;
	private String specification;
	private String manufacturer;
	private int quantity;
    
	
// //OnetoOne with Backlog
@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@JoinColumn(referencedColumnName="cartId")
   private Category category;
//    


	@OneToOne(fetch = FetchType.EAGER,mappedBy = "property")
	@JoinColumn(name = "customer_id",nullable = false)
	@JsonIgnore
	private Customer customer;
   
    
	
	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
public String getPropertyIdentifier() {
		return propertyIdentifier;
	}
	public void setPropertyIdentifier(String propertyIdentifier) {
		this.propertyIdentifier = propertyIdentifier;
	}
	

	
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Property [propertyId=" + propertyId + ", propertyName=" + propertyName + ", propertyIdentifier="
				+ propertyIdentifier + ", price=" + price + ", color=" + color + ", dimension=" + dimension
				+ ", specification=" + specification + ", manufacturer=" + manufacturer + ", quantity=" + quantity
				+ ", category=" + category + "]";
	}
	

	
	
	
	
	
}
