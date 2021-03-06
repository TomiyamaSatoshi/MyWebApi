package jp.co.api.myweb.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import jp.co.api.myweb.exception.ApplicationErrorException;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {
	
	private String errorCode;
	private String functionName;
	private String message;
	
	public static ResponseEntity<ErrorResponse> createResponse(ApplicationErrorException e, HttpStatus status) {
		return new ResponseEntity<ErrorResponse>(
				new ErrorResponse(e.getErrorCode(), e.getFunctionName(), e.getMessage())
				, status);
				
	}

}
