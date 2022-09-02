package com.itudy.userservice.persistence.service;

import com.itudy.userservice.persistence.entity.AuthVO;
import com.itudy.userservice.persistence.exception.ExceptionEnum;
import com.itudy.userservice.persistence.exception.UserException;
import com.itudy.userservice.persistence.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthDomainService {

    private final AuthRepository authRepository;

    public AuthVO findByName(String name) {
        return authRepository.findById(name).orElseThrow(
                () -> new UserException(ExceptionEnum.INVALID_USER_EMAIL_EXCEPTION)
        );
    }
}
