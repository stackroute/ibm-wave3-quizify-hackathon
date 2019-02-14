package com.example.stackroute.gamemanager.controller;


import com.example.stackroute.gamemanager.domain.Game;
import com.example.stackroute.gamemanager.exception.GameAlreadyExists;
import com.example.stackroute.gamemanager.exception.GameNotFound;
import com.example.stackroute.gamemanager.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class GameController {

    private ResponseEntity responseEntity;
    private GameService gameService;

    private GameController(final GameService gameService)
    {
        this.gameService=gameService;
    }

    @PostMapping("game")
    public ResponseEntity<?> saveGame(@RequestBody Game game) throws GameAlreadyExists {

        try {
            gameService.saveGame(game);
            responseEntity = new ResponseEntity(game, HttpStatus.CREATED);
        }
        catch(GameAlreadyExists e)
        {
           responseEntity = new ResponseEntity(e.getMessage(),HttpStatus.CONFLICT) ;
        }
        return responseEntity;
    }

    @DeleteMapping("game/{id}")
    public ResponseEntity<?> deleteGame(@PathVariable("id") String id) throws GameNotFound
    {
        try {
            gameService.deleteGame(id);
            responseEntity = new ResponseEntity("Game deleted", HttpStatus.OK);
        }
        catch(GameNotFound e){
            responseEntity = new ResponseEntity(e.getMessage(),HttpStatus.CONFLICT);
        }
      return responseEntity;

    }

    @PutMapping("game")
    public ResponseEntity<?> updateGame(Game updatedGame) throws GameNotFound{

        ResponseEntity responseEntity;
        try {
            gameService.updateGame(updatedGame);
            responseEntity = new ResponseEntity("updated game", HttpStatus.CREATED);
        }
        catch (GameNotFound e)
        {
           responseEntity = new ResponseEntity(e.getMessage(),HttpStatus.CONFLICT);
        }
    return responseEntity;

    }


}
