package com.example.profile.domain.services;

import com.example.profile.domain.entities.InfoAcademy;
import com.example.profile.domain.gateway.InfoAcademyGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InfoAcademyService {

    @Autowired
    private InfoAcademyGateway gateway;

    public List<InfoAcademy> getAll(){

        return gateway.getAll();
    }

    public Optional<InfoAcademy> getInfoAcademyById(Integer id){

        return gateway.getInfoAcademyById(id);
    }

    public InfoAcademy saveInfoAcademy(InfoAcademy infoAcademy){

        return gateway.saveInfoAcademy(infoAcademy);
    }
    public void deleteInfoAcademyById(Integer id){
        gateway.deleteInfoAcademy(id);

    }
}
