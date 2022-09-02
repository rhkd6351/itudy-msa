package com.itudy.userservice.persistence.repository;

import com.itudy.userservice.persistence.entity.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserVO, Long> {

    public Optional<UserVO> findByRefreshToken(String refreshToken);

    public Optional<UserVO> findByEmail(String email);

    public boolean existsByEmail(String email);

}
