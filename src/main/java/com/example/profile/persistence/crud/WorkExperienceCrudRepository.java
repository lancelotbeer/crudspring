package com.example.profile.persistence.crud;

import com.example.profile.persistence.models.WorkExperienceDAO;
import org.springframework.data.repository.CrudRepository;

public interface WorkExperienceCrudRepository extends CrudRepository<WorkExperienceDAO, Integer> {
}
