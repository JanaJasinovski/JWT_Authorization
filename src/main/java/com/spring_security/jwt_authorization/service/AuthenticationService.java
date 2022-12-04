package com.spring_security.jwt_authorization.service;

import com.spring_security.jwt_authorization.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
