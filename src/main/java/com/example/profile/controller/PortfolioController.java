package com.example.profile.controller;


import com.example.profile.domain.entities.Portfolio;
import com.example.profile.domain.entities.User;
import com.example.profile.domain.services.PortfolioService;
import com.example.profile.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioService service;

    @GetMapping("/all")
    public ResponseEntity<List<Portfolio>> getAll(){

        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Portfolio> getPortfolioById(@PathVariable("id") Long id){
        return service.getPortfolioById(id).map(idp -> new ResponseEntity<>(idp,HttpStatus.OK))
                .orElse(new ResponseEntity<>(null,HttpStatus.NOT_FOUND));
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deletePortfolioById(@PathVariable("id")Long id){
        if(service.deletePortfolioById(id) == true){
            return new ResponseEntity<>(true,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
        }
    }
}
