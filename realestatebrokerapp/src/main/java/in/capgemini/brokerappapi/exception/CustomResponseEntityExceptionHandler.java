package in.capgemini.brokerappapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler
	  public final ResponseEntity<Object> handleProjectException(OrderIdException ex,WebRequest request){
		  OrderIdExceptionResponse  exceptionResponse=new OrderIdExceptionResponse(ex.getMessage());
		  return new ResponseEntity<Object>(exceptionResponse,HttpStatus.BAD_REQUEST);
	  }
}
