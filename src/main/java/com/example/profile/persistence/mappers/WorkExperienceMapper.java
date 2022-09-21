package com.example.profile.persistence.mappers;


import com.example.profile.domain.entities.WorkExperience;
import com.example.profile.persistence.models.WorkExperienceDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface WorkExperienceMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "business", target = "business"),
            @Mapping(source = "dateIni", target = "dateIni"),
            @Mapping(source = "dateEnd", target = "dateEnd"),
            @Mapping(source = "idUser",target = "idUser"),
            @Mapping(source = "userExp",target = "user")
    })
    WorkExperience toWorkExperience(WorkExperienceDAO dao);

    List<WorkExperience> toWorkExperience(List<WorkExperienceDAO> daos);

    @InheritInverseConfiguration
    @Mapping(target = "id", ignore = true)
    WorkExperienceDAO toWorkExperienceDAO(WorkExperience workExperience);
}
