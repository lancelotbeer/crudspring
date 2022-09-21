package com.example.profile.domain.gateway;

import com.example.profile.domain.entities.Portfolio;
import com.example.profile.domain.entities.User;

import java.util.List;
import java.util.Optional;

public interface PortfolioGateway {

    List<Portfolio> getAll();
    Optional<Portfolio> getPortfolioById(Long id);
    Portfolio savePortfolio(Portfolio portfolio);
    void deletePortfolio(Long id);
}
