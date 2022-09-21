package com.example.profile.persistence.models;


import com.example.profile.domain.entities.InfoAcademy;
import com.example.profile.domain.entities.Portfolio;
import com.example.profile.domain.entities.WorkExperience;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class UserDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
    private String name;
    private String lastName;
    private String email;
    private String address;
    private Date dateBirth;
    private String skill;
    private String country;
    private String city;
    private boolean changeResidence;




    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "idPortfolio")
    //private Portfolio portfolio;

    //@OneToMany
    //@JoinColumn(name = "id")
    //WorkExperience workExperience;

    //@OneToMany
    //@JoinColumn(name = "id")
    //InfoAcademy infoAcademy;


    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
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

    public boolean isChangeResidence() {

        return changeResidence;
    }

    public void setChangeResidence(boolean changeResidence) {

        this.changeResidence = changeResidence;
    }


}
