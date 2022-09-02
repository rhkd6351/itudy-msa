package com.itudy.userservice.persistence.repository;

import com.itudy.userservice.persistence.entity.AuthVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<AuthVO, String> {

}
