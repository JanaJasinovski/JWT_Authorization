package com.spring_security.jwt_authorization.repository;

import com.spring_security.jwt_authorization.model.JwtRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JwtRefreshTokenRepository extends JpaRepository<JwtRefreshToken, String> {

}
