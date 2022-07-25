package com.character.app.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.character.app.models.entity.Characters;
import com.character.app.models.services.Charactersinterface;

@RestController
@RequestMapping("/api")
public class CharactersControllers {

    @Autowired
    Charactersinterface iCharacters;

    @GetMapping("/characters")
    public List<Characters> findAll(){
        return iCharacters.findAll();
    }

    @GetMapping("/characters/{id}")
    public Characters findByID(@PathVariable  String id){
        return iCharacters.findByID(id);
    }
}
