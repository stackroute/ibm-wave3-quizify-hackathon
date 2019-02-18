package com.example.stackroute.gamemanager.service;

import com.example.stackroute.gamemanager.domain.Game;
import com.example.stackroute.gamemanager.exception.GameAlreadyExists;
import com.example.stackroute.gamemanager.exception.GameNotFound;
import com.example.stackroute.gamemanager.repository.GameRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
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
    public Game deleteGame(Game game) throws GameNotFound {
        Optional<Game> optional = gameRepository.findById(game.getId());
        log.info("check event+++++++" + optional);
        if (optional.isPresent()) {
            gameRepository.deleteById(game.getId());
            System.out.println("Id is" + game.getId());
            return game;
        } else {
            throw new GameNotFound("Event not Found");
        }
    }

    @Override
    public Game updateGame(Game updatedGame) throws GameNotFound{

    if(gameRepository.existsById(updatedGame.getId())){

        return gameRepository.save(updatedGame);
    }
    else
        throw new GameNotFound("Game not found");

    }
//
//    @Override
//    public List<Game> findByQuizName(String name){
//    }
//
//    @Override
//    public List<Game> findByAlphabet(String alphabet){
//
//
//    }

}
