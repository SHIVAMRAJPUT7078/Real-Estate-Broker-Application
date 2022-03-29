package in.capgemini.brokerappapi.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PropertyIdException extends RuntimeException  {
	
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public PropertyIdException() {
			super();
		}
		public PropertyIdException(String errMsg) {
			super(errMsg);
		}
}
