package com.egm.accountservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.xml.bind.ValidationException;
import java.util.Date;

@ControllerAdvice
public class ApiControlAdviceHandler extends ResponseEntityExceptionHandler {


	@ExceptionHandler(value = {Exception.class,NullPointerException.class, ValidationException.class})
	public ResponseEntity handler(Exception ex, WebRequest request) {

		String detail = ex.getLocalizedMessage();
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setDate(new Date());
		errorMessage.setDetail(detail);
		return new ResponseEntity(detail, HttpStatus.BAD_REQUEST);

	}

}
