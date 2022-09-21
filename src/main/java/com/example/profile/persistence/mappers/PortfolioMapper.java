package com.example.profile.persistence.mappers;


import com.example.profile.domain.entities.Portfolio;
import com.example.profile.domain.entities.User;
import com.example.profile.persistence.models.PortfolioDAO;
import com.example.profile.persistence.models.UserDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface PortfolioMapper {

    @Mappings({
            @Mapping(source = "idPortfolio", target="idPortfolio"),
            @Mapping(source = "resume", target="resume"),
            @Mapping(source = "idUser",target = "idUser"),
            @Mapping(source = "userPer",target = "user")
    })
    Portfolio toPortfolio(PortfolioDAO dao);

    List<Portfolio> toPortfolios(List<PortfolioDAO> daos);

    @InheritInverseConfiguration
    @Mapping(target = "idUser", ignore = true)
    PortfolioDAO toPortfolioDAO(Portfolio portfolio);
}
