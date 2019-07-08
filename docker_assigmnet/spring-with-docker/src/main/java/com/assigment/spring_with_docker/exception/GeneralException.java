package com.assigment.spring_with_docker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "NotFoundException ")
public final class GeneralException extends RuntimeException {


    public GeneralException(String message) {
        super(message);
    }
 
    public GeneralException(String message, Throwable cause) {
        super(message, cause);
    }
}