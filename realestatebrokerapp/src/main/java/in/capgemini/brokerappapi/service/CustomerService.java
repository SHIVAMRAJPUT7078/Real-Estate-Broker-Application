package in.capgemini.brokerappapi.service;

import java.util.List;

import in.capgemini.brokerappapi.domain.Customer;

/**
 * @author hsraj
 *
 */
public interface CustomerService {

	Customer addOrUpdateCustomer(Customer customer);
	public Customer findByCustomerIdentifier(String customerIdentifier);
	public Iterable<Customer> findAll();
	public void deleteCustomerByIdentifier(String customerIdentifier);
	/*
	Customer updateCustomer(Customer customer);
	void removeCustomer(Customer customer);
	Customer viewCustomer();
	List<Customer> viewAllCustomer();
	public Customer findByCustomerId(Long customerId);
	*/
	
}
