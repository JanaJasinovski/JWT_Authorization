package com.spring_security.jwt_authorization.service;

import com.spring_security.jwt_authorization.model.Role;
import com.spring_security.jwt_authorization.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);

    List<User> findAllUsers();
}