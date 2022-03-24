//step 1
package in.capgemini.brokerappapi.domain;

import java.util.Date;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Order {
	 @Id //it means it is a primary key
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long orderId;
	//@NotBlank(message="projectIdentifier is required")
	private String orderName;
	private Date orderDate;
	private String orderStatus;
	private String orderIdentifier;
	//private Customer customer;
	//private List<Property> propertyList;
	  @JsonFormat(pattern="yyyy-MM-dd")
		private Date start_date;
		@JsonFormat(pattern="yyyy-MM-dd")
		private Date end_At;
		
		 @JsonFormat(pattern="yyyy-MM-dd")
			private Date updated_At;
			@JsonFormat(pattern="yyyy-MM-dd")
			private Date created_At;
			
			public Order() {
				super();
				// TODO Auto-generated constructor stub
			}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderIdentifier() {
		return orderIdentifier;
	}
	public void setOrderIdentifier(String orderIdentifier) {
		this.orderIdentifier = orderIdentifier;
	}

	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	@PrePersist
	//this method automatically create current date with the help of prepersist
	public void onCreate() {
		this.created_At=new Date();
	}
	@PreUpdate
	//this method will give current update date with the help of preupdate
	public void onUpdate() {
		this.updated_At=new Date();
	}
	
	
	

}
