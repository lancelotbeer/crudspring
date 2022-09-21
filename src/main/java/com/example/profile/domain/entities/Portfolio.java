package com.example.profile.domain.entities;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Portfolio {

    private Long IdPortfolio;
    private String resume;
    private Long IdUser;

    private User user;


    public Long getIdPortfolio() {
        return IdPortfolio;
    }

    public void setIdPortfolio(Long idPortfolio) {

        IdPortfolio = idPortfolio;
    }

    public Long getIdUser() {

        return IdUser;
    }

    public void setIdUser(Long idUser) {

        IdUser = idUser;
    }

    public String getResume() {

        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
