package br.com.joaogosmani.blogapirestful.resources.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.joaogosmani.blogapirestful.services.exception.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException exception, HttpServletRequest request) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		String error = "Não encontrado";
		StandardError err = new StandardError(System.currentTimeMillis(), status.value(), error, exception.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
}
