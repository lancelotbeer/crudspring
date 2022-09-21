package com.example.profile.domain.services;

import com.example.profile.domain.entities.WorkExperience;
import com.example.profile.domain.gateway.WorkExperienceGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class WorkExperienceService {

    @Autowired
    private WorkExperienceGateway gateway;

    public List<WorkExperience> getAll(){

        return gateway.getAll();
    }

    public Optional<WorkExperience> getWorkExperienceById(Integer id){

        return gateway.getWorkExperienceById(id);
    }

    public WorkExperience saveWorkExperience(WorkExperience workExperience){

        return gateway.saveWorkExperience(workExperience);
    }
    public void deleteWorkExperienceById(Integer id){
         gateway.deleteWorkExperienceById(id);

    }
}
