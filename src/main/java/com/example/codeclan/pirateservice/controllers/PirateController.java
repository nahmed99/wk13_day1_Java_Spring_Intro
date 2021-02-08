package com.example.codeclan.pirateservice.controllers;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

// 'Register' this class with Spring by using annotations; to be managed by Spring.
// all necessary instances etc will be created by Spring.
@RestController
public class PirateController {

    // To get an instance of ANY repository use @Autowired
    @Autowired
    PirateRepository pirateRepository;

    // A controller route - to get ALL pirates
    @GetMapping(value = "/pirates")
    public List<Pirate> getAllPirates(){
        return pirateRepository.findAll(); // use pre-existing Spring methods.
    }

    // Get a specific pirate
    @GetMapping(value = "/pirates/{id}") // path variable between the { }
    //public Pirate getPirate(@PathVariable Long id) {
    public Optional<Pirate> getPirate(@PathVariable Long id) {
        return pirateRepository.findById(id); // use pre-existing Spring methods.
    }

}
