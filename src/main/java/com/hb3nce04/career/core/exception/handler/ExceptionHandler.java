package com.hb3nce04.career.core.exception.handler;

import com.hb3nce04.career.core.exception.EntityNotFoundException;
import com.hb3nce04.career.core.exception.util.ApiError;
import com.hb3nce04.career.core.exception.util.ValidationError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.Date;
import java.util.List;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ApiError> handleEntityNotFound() {
        ApiError error = new ApiError(new Date(), HttpStatus.NOT_FOUND, "Az adott entitás nem található.");
        return new ResponseEntity<>(error, new HttpHeaders(), error.getStatus());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationError> handleValidationErrors(MethodArgumentNotValidException ex) {
        List<String> errors = ex.getBindingResult().getFieldErrors()
                .stream().map(FieldError::getDefaultMessage).toList();
        ValidationError error = new ValidationError(new Date(), HttpStatus.BAD_REQUEST, "A megadott adatok hibásak.", errors);
        return new ResponseEntity<>(error, new HttpHeaders(), error.getStatus());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<ApiError> handleNoResourceFoundException(NoResourceFoundException ex) {
        ApiError error = new ApiError(new Date(), HttpStatus.BAD_REQUEST, "A megadott erőforrás nem található. (%s)".formatted(ex.getResourcePath()));
        return new ResponseEntity<>(error, new HttpHeaders(), error.getStatus());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<ApiError> handleNHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException ex) {
        ApiError error = new ApiError(new Date(), HttpStatus.BAD_REQUEST, "Az adott metódus nem támogatott. (%s)".formatted(ex.getMethod()));
        return new ResponseEntity<>(error, new HttpHeaders(), error.getStatus());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<ApiError> handleNHttpRequestMethodNotSupportedException() {
        ApiError error = new ApiError(new Date(), HttpStatus.FORBIDDEN, "Hibás felhasználónév vagy jelszó!");
        return new ResponseEntity<>(error, new HttpHeaders(), error.getStatus());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ApiError> handleHttpRequestMethodNotSupportedException(IllegalArgumentException ex) {
        ApiError error = new ApiError(new Date(), HttpStatus.BAD_REQUEST, ex.getMessage());
        return new ResponseEntity<>(error, new HttpHeaders(), error.getStatus());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleGeneralException() {
        ApiError error = new ApiError(new Date(), HttpStatus.INTERNAL_SERVER_ERROR, "Ismeretlen hiba történt!");
        return new ResponseEntity<>(error, new HttpHeaders(), error.getStatus());
    }
}
