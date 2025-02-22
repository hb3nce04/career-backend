package com.hb3nce04.career.core.exception.util;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ValidationError extends ApiError{
    private List<String> errors;
    public ValidationError(Date timestamp, HttpStatus status, String message, List<String> errors) {
        super(timestamp, status, message);
        this.errors = errors;
    }
}