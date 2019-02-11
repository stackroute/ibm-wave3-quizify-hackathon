package com.example.stackroute.gamemanager.service;

import com.example.stackroute.gamemanager.domain.Game;
import com.example.stackroute.gamemanager.exception.GameAlreadyExists;
import com.example.stackroute.gamemanager.exception.GameNotFound;
import com.example.stackroute.gamemanager.repository.GameRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class GameServiceimpl implements GameService {

    private static Logger log = LoggerFactory.getLogger(GameServiceimpl.class);

    private GameRepository gameRepository;


@Autowired
GameServiceimpl(GameRepository gameRepository){

this.gameRepository=gameRepository;
 }

 @Override
 public Game saveGame(Game game) throws GameAlreadyExists{
     Optional optional = gameRepository.findById(game.getId());
     if (optional.isPresent())
         throw new GameAlreadyExists("Event already exists");
     else
         return gameRepository.save(game);

 }

    @Override
    public Optional<Game> deleteGame(String id) throws GameNotFound {
        Optional<Game> optional = gameRepository.findById(id);
        log.info("check event+++++++" + optional);
        if (optional.isPresent()) {
            gameRepository.deleteById(id);
            System.out.println("Id is" + id);
            return optional;
        } else {
            throw new GameNotFound("Event not Found");
        }
    }
}
