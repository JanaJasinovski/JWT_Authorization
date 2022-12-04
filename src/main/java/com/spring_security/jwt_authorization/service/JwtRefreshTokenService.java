package com.spring_security.jwt_authorization.service;

import com.spring_security.jwt_authorization.model.JwtRefreshToken;
import com.spring_security.jwt_authorization.model.User;

public interface JwtRefreshTokenService {
    JwtRefreshToken createRefreshToken(Long userId);

    User generateAccessTokenFromRefreshToken(String refreshTokenId);
}
