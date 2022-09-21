package com.example.profile.persistence;

import com.example.profile.domain.entities.WorkExperience;
import com.example.profile.domain.gateway.WorkExperienceGateway;
import com.example.profile.persistence.crud.WorkExperienceCrudRepository;
import com.example.profile.persistence.mappers.WorkExperienceMapper;
import com.example.profile.persistence.models.WorkExperienceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class WorkExperienceRepository implements WorkExperienceGateway {

    @Autowired
    private WorkExperienceCrudRepository crudRepository;

    @Autowired
    private WorkExperienceMapper mapper;

    @Override
    public List<WorkExperience> getAll() {
        List<WorkExperienceDAO> daos = (List<WorkExperienceDAO>) crudRepository.findAll();
        List<WorkExperience> workExperienceList = mapper.toWorkExperience(daos);
        return workExperienceList;
    }

    @Override
    public Optional<WorkExperience> getWorkExperienceById(Integer id) {
        return crudRepository.findById(id).map(idp -> mapper.toWorkExperience(idp));
    }

    @Override
    public WorkExperience saveWorkExperience(WorkExperience workExperience) {
        WorkExperienceDAO dao = mapper.toWorkExperienceDAO(workExperience);
        return mapper.toWorkExperience(crudRepository.save(dao));
    }


    @Override
    public void deleteWorkExperienceById(Integer id) {

        crudRepository.deleteById(id);
    }
}
