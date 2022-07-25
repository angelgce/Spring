package com.character.app.models.dao;
import org.springframework.data.repository.CrudRepository;
import com.character.app.models.entity.Characters;

public interface CharactersDAO extends CrudRepository<Characters, String> {

}
