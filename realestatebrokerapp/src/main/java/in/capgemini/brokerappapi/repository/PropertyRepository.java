package in.capgemini.brokerappapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.capgemini.brokerappapi.domain.Property;


@Repository
public interface PropertyRepository extends CrudRepository<Property, Long>{
	
	
	Property findByPropertyIdentifier(String propertyIdentifier);
	Iterable<Property> findAll(); 
	
	
	
}
