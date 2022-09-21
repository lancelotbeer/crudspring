package com.example.profile.controller;


import com.example.profile.domain.entities.InfoAcademy;
import com.example.profile.domain.services.InfoAcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/info_academy")
public class InfoAcademyController {

    @Autowired
    private InfoAcademyService service;

    @GetMapping("/all")
    public ResponseEntity<List<InfoAcademy>> getAll(){
        System.out.println("--->");
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InfoAcademy> getInfoAcademyById(@PathVariable("id") Integer id){
        System.out.println("--->"+id);
        return service.getInfoAcademyById(id).map(idp -> new ResponseEntity<>(idp,HttpStatus.OK))
                .orElse(new ResponseEntity<>(null,HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<InfoAcademy> saveInfoAcademy(@RequestBody InfoAcademy infoAcademy){
        return new ResponseEntity<>(service.saveInfoAcademy(infoAcademy),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteInfoAcademyById(@PathVariable("id")Integer id){
        Optional<InfoAcademy> inforAcademy = service.getInfoAcademyById(id);

        if (inforAcademy != null && inforAcademy.isEmpty()) {
            return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
        }else {
            service.deleteInfoAcademyById(id);
            return new ResponseEntity<>(true,HttpStatus.OK);
        }

    }
}
