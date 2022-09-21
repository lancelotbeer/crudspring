package com.example.profile.persistence.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "info_academy")
public class InfoAcademyDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String institution;
    @Column(name = "date_ini")
    private Date dateIni;
    @Column(name = "date_end")
    private Date dateEnd;
    @Column(name = "type_edu")
    private String typeEdu;
    @Column(name = "id_user")
    private Long idUser;

    @ManyToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "FK_academy"))
    private UserDAO userAca;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
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

    public String getTypeEdu() {
        return typeEdu;
    }

    public void setTypeEdu(String typeEdu) {
        this.typeEdu = typeEdu;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public UserDAO getUserAca() {
        return userAca;
    }

    public void setUserAca(UserDAO userAca) {
        this.userAca = userAca;
    }
}
