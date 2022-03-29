package in.capgemini.brokerappapi.domain;




import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cartId;
	
	private String categoryName;	
	
	
////	//OnetoOne with Property
//	@OneToOne(fetch=FetchType.EAGER)
//	@JoinColumn(name="property_id")
////	@JsonIgnore
//private Property property;
//	
	
	public Category() {
		super();
		
	}
	
	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}


   public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

   @Override
	public String toString() {
		return "Category [cartId=" + cartId + ", categoryName=" + categoryName 
				+"]";
	}


	
}
