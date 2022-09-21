package com.example.profile.persistence.crud;

import com.example.profile.persistence.models.PortfolioDAO;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PortfolioCrudRepository extends CrudRepository<PortfolioDAO, Long> {

    Optional<PortfolioDAO> findById(Long id);
}
