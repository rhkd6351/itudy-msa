package com.itudy.userservice.persistence.exception;

import lombok.Getter;

@Getter
public class UserException extends RuntimeException{

    private final ExceptionEnum error;

    public UserException(ExceptionEnum error) {
        super(error.getMessage());
        this.error = error;
    }
}
