package in.capgemini.brokerappapi.web;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.capgemini.brokerappapi.domain.Category;
import in.capgemini.brokerappapi.domain.Property;
import in.capgemini.brokerappapi.repository.CategoryRepository;
import in.capgemini.brokerappapi.repository.PropertyRepository;

import in.capgemini.brokerappapi.service.PropertyService;
import in.capgemini.brokerappapi.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/property")
public class PropertyController {
	
	@Autowired
	private PropertyService propertyService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("")
	public ResponseEntity<?> createNewProperty(@Valid @RequestBody Property property,BindingResult result) {

	ResponseEntity<?> errorMap=mapValidationErrorService.mapValidationError(result);
	if(errorMap!=null) return errorMap;
	Property savedOrder=propertyService.addorUpdateProperty(property);
	return new ResponseEntity<Property>(savedOrder,HttpStatus.CREATED);
	}
		

	
	@GetMapping("/{propertyId}")
	public ResponseEntity<?> getPropertyById(@PathVariable String propertyId){
		Property property=propertyService.findByPropertyIdentifier(propertyId);
		return new ResponseEntity<Property>(property,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/all")
	public Iterable<Property> getAllProperties(){
		return propertyService.findAllProperty();
	}
	
	@DeleteMapping("/{propertyId}")
	public ResponseEntity<?> deleteProperty(@PathVariable String propertyId) {
		propertyService.deletePropertyByPropertyIdentifier(propertyId);
		return new ResponseEntity<String>("Property with Id: "+propertyId.toUpperCase()+" Deleted successfully!",HttpStatus.OK);
		
	}
}