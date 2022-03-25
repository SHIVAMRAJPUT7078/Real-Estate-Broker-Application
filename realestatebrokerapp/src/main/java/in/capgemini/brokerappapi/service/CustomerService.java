package in.capgemini.brokerappapi.service;

import java.util.List;

import in.capgemini.brokerappapi.domain.Customer;

/**
 * @author hsraj
 *
 */
public interface CustomerService {

	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void removeCustomer(Customer customer);
	Customer viewCustomer();
	List<Customer> viewAllCustomer();
	
}
