package in.capgemini.brokerappapi.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Order {
	private String orderId;
	private Date orderDate;
	private String orderStatus;
	private String orderIdentifier;
	private Customer customer;
	private List<Property> propertyList;
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
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Property> getPropertyList() {
		return propertyList;
	}
	public void setPropertyList(List<Property> propertyList) {
		this.propertyList = propertyList;
	}
	public String getOrderIdentifier() {
		return orderIdentifier;
	}
	public void setOrderIdentifier(String orderIdentifier) {
		this.orderIdentifier = orderIdentifier;
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
