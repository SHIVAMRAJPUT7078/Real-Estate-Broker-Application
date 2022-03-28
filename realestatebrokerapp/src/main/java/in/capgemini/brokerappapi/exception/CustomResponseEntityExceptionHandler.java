package in.capgemini.brokerappapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	
	
	@ExceptionHandler
	  public final ResponseEntity<Object> handleProjectException(PropertyIdException ex,WebRequest request){
	  PropertyIdExceptionResponse  exceptionResponse=new PropertyIdExceptionResponse(ex.getMessage());
      return new ResponseEntity<Object>(exceptionResponse,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler
      public final ResponseEntity<Object> handleProjectException(OrderIdException ex,WebRequest request){
		  OrderIdExceptionResponse  exceptionResponse=new OrderIdExceptionResponse(ex.getMessage());
	  return new ResponseEntity<Object>(exceptionResponse,HttpStatus.BAD_REQUEST);
	
	
	
}
}



