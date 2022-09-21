package com.example.profile.persistence;

import com.example.profile.domain.entities.InfoAcademy;
import com.example.profile.domain.gateway.InfoAcademyGateway;
import com.example.profile.persistence.crud.InfoAcademyCrudRepository;
import com.example.profile.persistence.mappers.InfoAcademyMapper;
import com.example.profile.persistence.models.InfoAcademyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InfoAcademyRepository implements InfoAcademyGateway {

    @Autowired
    private InfoAcademyCrudRepository crudRepository;

    @Autowired
    private InfoAcademyMapper mapper;

    @Override
    public List<InfoAcademy> getAll() {
        List<InfoAcademyDAO> daos = (List<InfoAcademyDAO>) crudRepository.findAll();
        List<InfoAcademy> infoAcademyList = mapper.toInfoAcademy(daos);
        return infoAcademyList;
    }

    @Override
    public Optional<InfoAcademy> getInfoAcademyById(Integer id) {
        return crudRepository.findById(id).map(idp -> mapper.toInfoAcademy(idp));
    }

    @Override
    public InfoAcademy saveInfoAcademy(InfoAcademy infoAcademy) {
        InfoAcademyDAO dao = mapper.toInfoAcademyDAO(infoAcademy);
        return mapper.toInfoAcademy(crudRepository.save(dao));
    }

    @Override
    public void deleteInfoAcademy(Integer id) {
        crudRepository.deleteById(id);
    }
}
