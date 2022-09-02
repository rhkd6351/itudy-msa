package com.itudy.userservice.persistence.service;

import com.itudy.userservice.persistence.entity.UserVO;
import com.itudy.userservice.persistence.exception.ExceptionEnum;
import com.itudy.userservice.persistence.exception.UserException;
import com.itudy.userservice.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDomainService {

    private final UserRepository userRepository;

    public UserVO saveUser(UserVO user) {
        return userRepository.save(user);
    }

    public UserVO findByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(
                () -> new UserException(ExceptionEnum.INVALID_USER_EMAIL_EXCEPTION)
        );
    }

    public boolean isExistByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    public UserVO findByIdx(Long idx){
        return userRepository.findById(idx).orElseThrow(
                () -> new UserException(ExceptionEnum.INVALID_USER_IDX_EXCEPTION)
        );
    }

}
