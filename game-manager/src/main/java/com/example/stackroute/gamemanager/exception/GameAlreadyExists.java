package com.example.stackroute.gamemanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Game already exists on server")
public class GameAlreadyExists extends Exception{


        public GameAlreadyExists(String message) {

            super(message);
        }
}
