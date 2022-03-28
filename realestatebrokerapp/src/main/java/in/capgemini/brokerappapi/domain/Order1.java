//step 1
package in.capgemini.brokerappapi.domain;

import java.util.Date;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

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
		private Date start_date;
		private Date end_At;
		private Date updated_At;
		private Date created_At;
		
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


		public Date getStart_date() {
			return start_date;
		}


		public void setStart_date(Date start_date) {
			this.start_date = start_date;
		}


		public Date getEnd_At() {
			return end_At;
		}


		public void setEnd_At(Date end_At) {
			this.end_At = end_At;
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
