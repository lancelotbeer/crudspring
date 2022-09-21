package com.example.profile.domain.gateway;

import com.example.profile.domain.entities.WorkExperience;

import java.util.List;
import java.util.Optional;

public interface WorkExperienceGateway {

    List<WorkExperience> getAll();
    Optional<WorkExperience> getWorkExperienceById(Integer id);
    WorkExperience saveWorkExperience(WorkExperience workExperience);
    void deleteWorkExperienceById(Integer id);
}
