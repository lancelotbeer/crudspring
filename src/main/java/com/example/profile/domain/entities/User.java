package com.example.profile.domain.entities;

import lombok.NoArgsConstructor;


import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Date;


@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String address;
    private Date dateBirth;
    private String skill;

    private String country;

    private String city;
    private Boolean changeResidence;

    private Portfolio portfolio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Boolean getChangeResidence() {
        return changeResidence;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setChangeResidence(Boolean changeResidence) {
        this.changeResidence = changeResidence;
    }
}
