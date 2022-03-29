package in.capgemini.brokerappapi.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.capgemini.brokerappapi.domain.Address;
import in.capgemini.brokerappapi.domain.Customer;
import in.capgemini.brokerappapi.exception.CustomerIdException;
import in.capgemini.brokerappapi.repository.CustomerRepository;
import in.capgemini.brokerappapi.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Customer addOrUpdateCustomer(Customer customer) {
		if(customer.getAddress() == null) {
			Customer cus = customerRepository.findByCustomerIdentifier(customer.getCustomerIdentifier());
			Address address = cus.getAddress();
			customer.setAddress(address);
			address.setCustomer(customer);
			return customerRepository.save(customer);
		
		}
		
		
		return customerRepository.save(customer);
		
	}
	@Override
	public Customer findByCustomerIdentifier(String id) {
		Customer customer = customerRepository.findByCustomerIdentifier(id);
		if(customer==null) {
			throw new CustomerIdException("Customer Identifier " + id + " does not exist");
		}
		return customer;
	}
	
	@Override
	public Iterable<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomerByIdentifier(String customerIdentifier) {
		Customer customer = customerRepository.findByCustomerIdentifier(customerIdentifier);
		if(customer==null) {
			throw new CustomerIdException("Customer Identifier " + customerIdentifier + " does not exist");
		}
		customerRepository.delete(customer);
		
	}
	
}
