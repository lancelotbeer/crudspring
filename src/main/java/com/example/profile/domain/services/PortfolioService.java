package com.example.profile.domain.services;


import com.example.profile.domain.entities.Portfolio;
import com.example.profile.domain.entities.User;
import com.example.profile.domain.gateway.PortfolioGateway;
import com.example.profile.domain.gateway.UserGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioGateway gateway;

    public List<Portfolio> getAll(){

        return gateway.getAll();
    }

    public Optional<Portfolio> getPortfolioById(Long id){

        return gateway.getPortfolioById(id);
    }

    public Portfolio savePortfolio(Portfolio portfolio){

        return gateway.savePortfolio(portfolio);
    }
    public boolean deletePortfolioById(Long id){
        return getPortfolioById(id).map(idp -> {
            gateway.deletePortfolio(id);
            return true;
        }).orElse(false);
    }
}
