package com.planets.galaxy.controller;

import com.planets.galaxy.model.Mercury;
import com.planets.galaxy.repository.MercuryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planets/mercury")
public class MercuryController {

    MercuryRepository mercuryRepository;

    public MercuryController(MercuryRepository mercuryRepository) {
        this.mercuryRepository = mercuryRepository;
    }

    @PostMapping()
    public Mercury insert(@RequestBody Mercury mercury){
        mercuryRepository.save(mercury);
        return mercury;
    }
}
