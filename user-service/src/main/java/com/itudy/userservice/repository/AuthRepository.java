package com.itudy.userservice.repository;

import com.itudy.userservice.entity.AuthVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<AuthVO, Long> {
}
