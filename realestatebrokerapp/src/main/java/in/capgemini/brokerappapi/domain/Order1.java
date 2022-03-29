//step 1
package in.capgemini.brokerappapi.domain;

import java.util.Date;
//import java.util.List;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
public class Order1 {
	 
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		private Long orderId;
		@NotBlank(message="orderStatus is required")
		private String orderStatus;
		@NotBlank(message="orderIdentifier is required")
		@Size(min=4,max=5,message="pls use 4 to 5 character")
		@Column(updatable=false,unique=true)
		private String orderIdentifier;
		
		private Date updated_At;
		private Date created_At;
		
		@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
		@JoinColumn(referencedColumnName="propertyId")
		   
		private Property property;
		
		public Order1() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Long getOrderId() {
			return orderId;
		}


		public void setOrderId(Long orderId) {
			this.orderId = orderId;
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


		


		public Date getUpdated_At() {
			return updated_At;
		}


		public void setUpdated_At(Date updated_At) {
			this.updated_At = updated_At;
		}


		public Date getCreated_At() {
			return created_At;
		}


		public void setCreated_At(Date created_At) {
			this.created_At = created_At;
		}




		public Property getProperty() {
			return property;
		}


		public void setProperty(Property property) {
			this.property = property;
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


		@Override
		public String toString() {
			return "Order1 [orderId=" + orderId + ", orderStatus=" + orderStatus + ", orderIdentifier="
					+ orderIdentifier + ", updated_At=" + updated_At + ", created_At=" + created_At + ", property="
					+ property + "]";
		}
		
}
