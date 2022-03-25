package in.capgemini.brokerappapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.capgemini.brokerappapi.domain.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

	
}
