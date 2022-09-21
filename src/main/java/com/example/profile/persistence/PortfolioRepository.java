package com.example.profile.persistence;


import com.example.profile.domain.entities.Portfolio;
import com.example.profile.domain.entities.User;
import com.example.profile.domain.gateway.PortfolioGateway;
import com.example.profile.persistence.crud.PortfolioCrudRepository;
import com.example.profile.persistence.crud.UserCrudRepository;
import com.example.profile.persistence.mappers.PortfolioMapper;
import com.example.profile.persistence.mappers.UserMapper;
import com.example.profile.persistence.models.PortfolioDAO;
import com.example.profile.persistence.models.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PortfolioRepository implements PortfolioGateway {

    @Autowired
    private PortfolioCrudRepository crudRepository;

    @Autowired
    private PortfolioMapper mapper;


    @Override
    public List<Portfolio> getAll() {
        List<PortfolioDAO> daos = (List<PortfolioDAO>) crudRepository.findAll();
        List<Portfolio> portfolioList = mapper.toPortfolios(daos);
        return portfolioList;
    }

    @Override
    public Optional<Portfolio> getPortfolioById(Long id) {
        return crudRepository.findById(id).map(idp -> mapper.toPortfolio(idp));
    }

    @Override
    public Portfolio savePortfolio(Portfolio portfolio) {
        return null;
    }


    @Override
    public void deletePortfolio(Long id) {
        crudRepository.deleteById(id);
    }
}
