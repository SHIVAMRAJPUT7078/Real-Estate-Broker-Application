package in.capgemini.brokerappapi.web;

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
import in.capgemini.brokerappapi.domain.Order;
import in.capgemini.brokerappapi.service.OrderService;
import in.capgemini.brokerappapi.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("api/orders")
public class ProjectController {
  
	@Autowired
	private OrderService orderService;
	
	public Order createNewOrder( @RequestBody Order order) {
		Order savedOrder=orderService.addorUpdate(order);
		return savedOrder;
	}
	@Autowired
	private MapValidationErrorService  mapValidationErrorService;
	
	@PostMapping("")
	public ResponseEntity<?> createNewOrder( @RequestBody Order order ,BindingResult result){
		ResponseEntity<?> errorMap=mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		
		Order savedOrder=orderService.addorUpdate(order);
		return new ResponseEntity<Order>(savedOrder,HttpStatus.CREATED);
	}
	
	@GetMapping("/{orderId}")
	public ResponseEntity<?> getOrderById(@PathVariable String orderId){
		Order order=orderService.findOrderByOrderIdentifier(orderId.toUpperCase());
		return new ResponseEntity<Order>(order,HttpStatus.OK);
		
	}
	
	@GetMapping("/all")
	public Iterable<Order> getAllProjects(){
		return orderService.findAllOrder();
	}
	
	@DeleteMapping("/{orderid}")
	public ResponseEntity<?> deleteOrder(@PathVariable String orderId){
		orderService.deleteOrderByOrderIdentifier(orderId);
		return new ResponseEntity<String>("Order with Id:"+orderId.toUpperCase()+"Deleted successfully!",HttpStatus.OK);
	}
}
