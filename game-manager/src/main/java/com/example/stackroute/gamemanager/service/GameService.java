package com.example.stackroute.gamemanager.service;

import com.example.stackroute.gamemanager.domain.Game;
import com.example.stackroute.gamemanager.exception.GameAlreadyExists;
import com.example.stackroute.gamemanager.exception.GameNotFound;

import java.util.Optional;

public interface GameService {

   Game saveGame(Game game) throws GameAlreadyExists;

   Optional<Game> deleteGame(String id) throws GameNotFound;

   Game updateGame(Game game) throws GameNotFound;

}
