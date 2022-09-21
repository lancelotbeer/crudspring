package com.example.profile.domain.gateway;

import com.example.profile.domain.entities.InfoAcademy;

import java.util.List;
import java.util.Optional;

public interface InfoAcademyGateway {

    List<InfoAcademy> getAll();
    Optional<InfoAcademy> getInfoAcademyById(Integer id);
    InfoAcademy saveInfoAcademy(InfoAcademy infoAcademy);
    void deleteInfoAcademy(Integer id);
}
