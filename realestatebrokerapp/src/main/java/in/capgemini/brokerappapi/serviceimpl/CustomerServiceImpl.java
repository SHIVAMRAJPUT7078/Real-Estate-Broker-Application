package in.capgemini.brokerappapi.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.capgemini.brokerappapi.domain.Customer;
import in.capgemini.brokerappapi.repository.CustomerRepository;
import in.capgemini.brokerappapi.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
		
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customer;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Optional<Customer> customer2 =  customerRepository.findById(customer.getCustId());
	
		
	}

	@Override
	public Customer viewCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> viewAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
