package com.example.stackroute.gamemanager.service;

import com.example.stackroute.gamemanager.domain.Game;
import com.example.stackroute.gamemanager.domain.Question;
import com.example.stackroute.gamemanager.exception.GameAlreadyExists;
import com.example.stackroute.gamemanager.exception.GameNotFound;

import java.util.List;


public interface GameService {

   Game saveGame(Game game) throws GameAlreadyExists;

   Game deleteGame(Game game) throws GameNotFound;

   Game updateGame(Game game) throws GameNotFound;

   Game getGame(String getName) throws GameNotFound;

   List<Game> findAllGames(String categoryName, String topicName)throws GameNotFound;

   List<Game> searchGame(String gameName)throws GameNotFound;

}
