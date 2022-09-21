package com.example.profile.persistence.mappers;


import com.example.profile.domain.entities.User;
import com.example.profile.persistence.models.UserDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(source = "idUser", target="id"),
            @Mapping(source = "name",target = "name"),
            @Mapping(source = "lastName",target = "lastName"),
            @Mapping(source = "email",target = "email"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "dateBirth",target = "dateBirth"),
            @Mapping(source = "skill",target = "skill"),
            @Mapping(source = "country",target = "country"),
            @Mapping(source = "city",target = "city"),
            @Mapping(source = "changeResidence",target = "changeResidence")

    })
    User toUser(UserDAO dao);

    List<User> toUsers(List<UserDAO> daos);

    @InheritInverseConfiguration
    @Mapping(target = "idUser", ignore = true)
    UserDAO toUserDAO(User user);
}
