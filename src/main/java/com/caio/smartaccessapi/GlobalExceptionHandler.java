package com.caio.smartaccessapi;


import com.caio.smartaccessapi.exception.ErrorResponse;
import com.caio.smartaccessapi.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handletNotFound(ResourceNotFoundException ex){
         return new ErrorResponse(LocalDateTime.now(), 404, ex.getMessage());
    }
}
