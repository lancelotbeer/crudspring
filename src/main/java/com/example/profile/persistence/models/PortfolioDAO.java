package com.example.profile.persistence.models;


import com.example.profile.domain.entities.Portfolio;
import com.example.profile.domain.entities.User;

import javax.persistence.*;

@Entity
@Table(name = "portfolio")
public class PortfolioDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_portfolio")
    private Long idPortfolio;

    private String resume;
    @Column(name = "id_user")
    private Long idUser;

    @OneToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private UserDAO userPer;

    public Long getIdPortfolio() {
        return idPortfolio;
    }

    public void setIdPortfolio(Long idPortfolio) {
        this.idPortfolio = idPortfolio;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public UserDAO getUserPer() {
        return userPer;
    }

    public void setUserPer(UserDAO userPer) {
        this.userPer = userPer;
    }
}
