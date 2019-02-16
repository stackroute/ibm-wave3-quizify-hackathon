package com.example.stackroute.gamemanager.controller;


import com.example.stackroute.gamemanager.domain.Game;
import com.example.stackroute.gamemanager.domain.Question;
import com.example.stackroute.gamemanager.exception.GameAlreadyExists;
import com.example.stackroute.gamemanager.exception.GameNotFound;
import com.example.stackroute.gamemanager.service.GameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.springframework.boot.web.servlet.server.Session.SessionTrackingMode.URL;

@CrossOrigin
@RestController
@RequestMapping("api/v1")
@Api(description = "Game Manager Services")
public class GameController {

    private ResponseEntity<?> responseEntity;
    private GameService gameService;

    @Autowired
    private RestTemplate restTemplate;
    private GameController(GameService gameService)
    {
        this.gameService=gameService;
    }

    @ApiOperation(value = "Add Games")
    @PostMapping("/games/game")
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
    @ApiOperation(value = "Delete Game")
    @DeleteMapping("games/game")
    public ResponseEntity<?> deleteGame(@RequestBody Game game) throws GameNotFound
    {
        try {
            gameService.deleteGame(game);
            responseEntity = new ResponseEntity("Game deleted", HttpStatus.OK);
        }
        catch(GameNotFound e){
            responseEntity = new ResponseEntity(e.getMessage(),HttpStatus.CONFLICT);
        }
      return responseEntity;

    }
    @ApiOperation(value = "Updating Game")
    @PutMapping("games/game")
    public ResponseEntity<?> updateGame(Game updatedGame) throws GameNotFound{

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



    @GetMapping(value = "/games/game")
    public Game createGame(Game createdGame)
    {
        final String url = "http://172.23.239.184:8001/api/v1/categories/Dummy_Category/Dummy_Topic/easy/2";
        Game result = restTemplate.getForObject(url, Game.class);
        responseEntity = new ResponseEntity("get game question", HttpStatus.CREATED);
        return result;
    }
}
