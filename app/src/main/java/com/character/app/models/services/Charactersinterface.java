package com.character.app.models.services;

import java.util.List;
import com.character.app.models.entity.Characters;

public interface Charactersinterface {

    // REST FULL

    // findALL
    public List<Characters> findAll();

    // findbyID
    public Characters findByID(String id);

    // update
    public void update(String id);

    // delete

    public void delete(String id);

}
