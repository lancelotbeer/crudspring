package com.example.profile.persistence.crud;

import com.example.profile.persistence.models.UserDAO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<UserDAO, Long> {


    Optional<UserDAO> findById(Long id);

}
