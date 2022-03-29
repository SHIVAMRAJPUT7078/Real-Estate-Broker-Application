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
import in.capgemini.brokerappapi.domain.Customer;
import in.capgemini.brokerappapi.service.CustomerService;
import in.capgemini.brokerappapi.serviceimpl.MapValidationErrorService;


@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;

	
	@PostMapping("")
	public ResponseEntity<?> createCustomer(@Valid @RequestBody Customer customer ,BindingResult result){
		ResponseEntity<?> errorMap =  mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;

		Customer savedCustomer = customerService.addOrUpdateCustomer(customer);
		return new ResponseEntity<Customer>(savedCustomer , HttpStatus.CREATED);
	}
	
	@GetMapping("{customerId}")
	public ResponseEntity<?> getCustomerById(@PathVariable("customerId") String customerId){
		Customer customer=	customerService.findByCustomerIdentifier(customerId);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public Iterable<Customer> getAllCustomers(){
		return customerService.findAll();
	}
	
	@DeleteMapping("/{customerId}")
	public ResponseEntity<?> deleteCustomer(@PathVariable("customerId") String customerId){
		customerService.deleteCustomerByIdentifier(customerId);
		return new ResponseEntity<String>("Customer with ID: " + customerId + " deleted successfully",HttpStatus.OK);	
	}
}




















/*
@PostMapping("")
public ResponseEntity<?> createCustomer(@Valid @RequestBody EmployeeRequest request ,BindingResult result){
	ResponseEntity<?> errorMap =  mapValidationErrorService.mapValidationError(result);
	if(errorMap!=null) return errorMap;
//	Address address = new Address();
//	address.setHouseNumber(request.getAddress().get);
//	dept.setName(request.getDept());
//	Address address = request.getAddress();
	addressRepository.save(request.getAddress());
//	dRepo.save(request.getAddress());
	Customer customer = new Customer(request);
	customer.setAddress(request.getAddress());
//	cutomer.setDept(dept);
	Customer savedCustomer = customerService.addCustomer(customer);
	return new ResponseEntity<Customer>(savedCustomer , HttpStatus.CREATED);
}
*/




//Address address = new Address();
//address.setHouseNumber(request.getAddress().get);
//dept.setName(request.getDept());
//Address address = request.getAddress();
//addressRepository.save(request.getAddress());
//dRepo.save(request.getAddress());
//Customer customer = new Customer(request);
//customer.setAddress(request.getAddress());
//cutomer.setDept(dept);
//Address address = request.getAddress();
//address.setCustomer(request);