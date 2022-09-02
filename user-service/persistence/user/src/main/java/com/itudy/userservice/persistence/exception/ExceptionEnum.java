package com.itudy.userservice.persistence.exception;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public enum ExceptionEnum {
    INVALID_USER_EMAIL_EXCEPTION(HttpStatus.BAD_REQUEST, "U0001", "invalid email"),
    INVALID_USER_IDX_EXCEPTION(HttpStatus.BAD_REQUEST, "U0002", "invalid user idx"),
    INVALID_AUTH_NAME_EXCEPTION(HttpStatus.BAD_REQUEST, "U0003", "invalid auth name");

    private final HttpStatus status;
    private final String code;
    private String message;

    ExceptionEnum(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    ExceptionEnum(HttpStatus status, String code) {
        this.status = status;
        this.code = code;
    }
}
