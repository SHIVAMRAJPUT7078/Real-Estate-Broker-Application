package in.capgemini.brokerappapi.service;

import org.springframework.data.repository.CrudRepository;

import in.capgemini.brokerappapi.domain.Customer;

public interface CustomerService extends CrudRepository<Customer, String> {

}
