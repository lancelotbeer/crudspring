package com.example.profile.persistence.mappers;


import com.example.profile.domain.entities.InfoAcademy;
import com.example.profile.persistence.models.InfoAcademyDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface InfoAcademyMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "institution", target = "institution"),
            @Mapping(source = "dateIni", target = "dateIni"),
            @Mapping(source = "dateEnd", target = "dateEnd"),
            @Mapping(source = "typeEdu", target = "typeEdu"),
            @Mapping(source = "idUser",target = "idUser"),
            @Mapping(source = "userAca",target = "user")

    })
    InfoAcademy toInfoAcademy(InfoAcademyDAO dao);

    List<InfoAcademy> toInfoAcademy(List<InfoAcademyDAO> daos);

    @InheritInverseConfiguration
    @Mapping(target = "id", ignore = true)
    InfoAcademyDAO toInfoAcademyDAO(InfoAcademy infoAcademy);
}
