package com.example.profile.domain.services;

import com.example.profile.domain.entities.User;
import com.example.profile.domain.gateway.UserGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserGateway gateway;

    public List<User> getAll(){

        return gateway.getAll();
    }

    public Optional<User> getUserById(Long id){

        return gateway.getUserById(id);
    }

    public User saveUser(User user){

        return gateway.saveUser(user);
    }
    public boolean deleteUserById(Long id){
        return getUserById(id).map(idp -> {
            gateway.deleteUser(id);
        return true;
        }).orElse(false);
    }




}
