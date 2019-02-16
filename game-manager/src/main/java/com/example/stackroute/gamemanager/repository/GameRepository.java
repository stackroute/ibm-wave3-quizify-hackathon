package com.example.stackroute.gamemanager.repository;

import com.example.stackroute.gamemanager.domain.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends MongoRepository<Game,String > {


}
