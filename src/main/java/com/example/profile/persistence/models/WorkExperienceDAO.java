package com.example.profile.persistence.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "work_experience")
public class WorkExperienceDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String business;
    private Date dateIni;
    private Date dateEnd;
    @Column(name = "id_user")
    private Long idUser;


    @ManyToOne
    @JoinColumn(name = "id_user", insertable = false,updatable = false,foreignKey = @ForeignKey(name="FK_experience"))
    private UserDAO userExp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public Date getDateIni() {
        return dateIni;
    }

    public void setDateIni(Date dateIni) {
        this.dateIni = dateIni;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public UserDAO getUserExp() {
        return userExp;
    }

    public void setUserExp(UserDAO userExp) {
        this.userExp = userExp;
    }
}
