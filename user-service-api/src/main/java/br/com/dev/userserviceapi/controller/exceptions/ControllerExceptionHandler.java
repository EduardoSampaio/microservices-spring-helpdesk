package br.com.dev.userserviceapi.controller.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import models.exceptions.ResourceNotFoundException;
import models.exceptions.StandardError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> handleResourceNotFoundException(final ResourceNotFoundException ex, final HttpServletRequest request) {

        var error = new StandardError(
                NOT_FOUND.value(),
                NOT_FOUND.getReasonPhrase(),
                request.getRequestURI(),
                ex.getMessage(),
                LocalDateTime.now());
        return ResponseEntity.status(NOT_FOUND).body(error);
    }
}
