package com.example.profile.domain.gateway;

import com.example.profile.domain.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserGateway {

    List<User> getAll();
    Optional<User> getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
}
