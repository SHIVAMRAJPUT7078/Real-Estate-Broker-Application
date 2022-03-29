package in.capgemini.brokerappapi.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.capgemini.brokerappapi.domain.Property;

import in.capgemini.brokerappapi.exception.PropertyIdException;

import in.capgemini.brokerappapi.repository.PropertyRepository;
import in.capgemini.brokerappapi.service.PropertyService;

@Repository
public class PropertyServiceImpl implements PropertyService{
	
	@Autowired
	private PropertyRepository propertyRepository;
	
//	@Autowired
//	private CartRepository cartRepository;
	

	@Override
	public Property addorUpdateProperty(Property property) {
		// TODO Auto-generated method stub
		try {
			
			property.setPropertyName(property.getPropertyName().toUpperCase());

			return propertyRepository.save(property);
			
		}catch(Exception ex) {
			throw new PropertyIdException("property name : "+property.getPropertyName()+" already exists");
		}
	
	}



	




	@Override
	public Iterable<Property> findAllProperty() {
		return propertyRepository.findAll();
	}




	@Override
	public Property findByPropertyIdentifier(String propertyId) {
		Property property=propertyRepository.findByPropertyIdentifier(propertyId);
		if(property==null) {
			throw new PropertyIdException("Property Identifier: "+propertyId.toUpperCase()+" Does not exist");
		}
		return property;
	}





	@Override
	public void deletePropertyByPropertyIdentifier(String propertyId) {
		// TODO Auto-generated method stub
		Property property=propertyRepository.findByPropertyIdentifier(propertyId);
		if(property==null) {
			throw new PropertyIdException("Property Identifier: "+propertyId.toUpperCase()+" Does not exist");
		}
		propertyRepository.delete(property);
		
		
	}





	


}
