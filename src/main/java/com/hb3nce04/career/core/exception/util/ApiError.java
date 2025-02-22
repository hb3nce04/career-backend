package com.hb3nce04.career.core.exception.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiError {
    private Date timestamp;
    private HttpStatus status;
    private String message;
}
