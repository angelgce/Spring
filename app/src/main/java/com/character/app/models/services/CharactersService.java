package com.character.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.character.app.models.dao.CharactersDAO;
import com.character.app.models.entity.Characters;

@Service
public class CharactersService implements Charactersinterface {

    @Autowired
    private CharactersDAO charactersDAO;

    @Override
    public List<Characters> findAll() {
        return (List<Characters>) charactersDAO.findAll();
    }

    @Override
    public Characters findByID(String id) {
        return charactersDAO.findById(id).orElse(null);
    }

    @Override
    public void update(String id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub

    }

}
