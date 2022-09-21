package com.example.profile.controller;


import com.example.profile.domain.entities.InfoAcademy;
import com.example.profile.domain.entities.WorkExperience;
import com.example.profile.domain.services.WorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/work_experience")
public class WorkExperienceController {

    @Autowired
    private WorkExperienceService service;

    @GetMapping("/all")
    public ResponseEntity<List<WorkExperience>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkExperience> getWorkExperienceById(@PathVariable("id") Integer id){
        return service.getWorkExperienceById(id).map(idp -> new ResponseEntity<>(idp,HttpStatus.OK))
                .orElse(new ResponseEntity<>(null,HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<WorkExperience> saveWorkExperience(@RequestBody WorkExperience workExperienceService){
        return new ResponseEntity<>(service.saveWorkExperience(workExperienceService),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteWorkExperienceById(@PathVariable("id")Integer id){

        Optional<WorkExperience> workExperience = service.getWorkExperienceById(id);

        if (workExperience != null && workExperience.isEmpty()) {
            return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
        }else {
            service.deleteWorkExperienceById(id);
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
    }
}
