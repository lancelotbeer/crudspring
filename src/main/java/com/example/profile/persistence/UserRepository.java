package com.example.profile.persistence;

import com.example.profile.domain.entities.InfoAcademy;
import com.example.profile.domain.entities.Portfolio;
import com.example.profile.domain.entities.User;
import com.example.profile.domain.entities.WorkExperience;
import com.example.profile.domain.gateway.UserGateway;
import com.example.profile.persistence.crud.UserCrudRepository;
import com.example.profile.persistence.mappers.UserMapper;
import com.example.profile.persistence.models.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements UserGateway {

    @Autowired
    private UserCrudRepository crudRepository;

    @Autowired
    private UserMapper mapper;


    @OneToOne(optional = false)
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @OneToMany
    @JoinColumn(name = "workExperience_id")
    private WorkExperience workExperience;

    @OneToMany
    @JoinColumn(name = "InfoAcademy_id")
    private InfoAcademy infoAcademy;

    @Override
    public List<User> getAll() {
        List<UserDAO> daos = (List<UserDAO>) crudRepository.findAll();
        List<User> userList = mapper.toUsers(daos);
        return userList;
    }

    @Override
    public Optional<User> getUserById(Long id) {

        return crudRepository.findById(id).map(idp -> mapper.toUser(idp));
    }

    @Override
    public User saveUser(User user) {
        UserDAO dao = mapper.toUserDAO(user);
        return mapper.toUser(crudRepository.save(dao));
    }

    @Override
    public void deleteUser(Long id) {

        crudRepository.deleteById(id);
    }
}
