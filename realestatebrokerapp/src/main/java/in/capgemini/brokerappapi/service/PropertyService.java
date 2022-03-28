package in.capgemini.brokerappapi.service;

import java.util.List;


import in.capgemini.brokerappapi.domain.Property;

public interface PropertyService {
	
    public Iterable<Property> findAllProperty();
	public Property addorUpdateProperty(Property property);
	public Property findByPropertyIdentifier(String propertyId);
 
    public void deletePropertyByPropertyIdentifier(String propertyId);
	

	
	

}
