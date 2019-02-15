package com.stackroute.userservice.controller;

import com.stackroute.userservice.domain.User;


import com.stackroute.userservice.exceptions.UserAlreadyExistException;
import com.stackroute.userservice.exceptions.UserNotFoundException;
import com.stackroute.userservice.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")

public class UserController {
    UserService userService;

@Autowired
    public UserController(UserService userService) {
    this.userService = userService;
}



        @PostMapping("/user")

        public ResponseEntity<?> saveUser(@RequestBody User user) throws UserAlreadyExistException, UserNotFoundException {
            ResponseEntity responseEntity;
           // try{
                userService.saveUser(user);
                responseEntity=new ResponseEntity<String>( "Created", HttpStatus.CREATED);
          //  }
            //catch (UserAlreadyExistException exception){
              //  responseEntity=new ResponseEntity<String>(exception.getMessage(),HttpStatus.CONFLICT);
            //}
            return responseEntity;
        }


    @GetMapping("/user")
        public ResponseEntity<?> getAllUser() {
            return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
        }


        @PutMapping("/user")
    public ResponseEntity<?> UpdateUser(@RequestBody User user) throws UserNotFoundException, UserAlreadyExistException {
            ResponseEntity responseEntity;
           // try{
                userService.saveUser(user);
                responseEntity=new ResponseEntity<String>( "updated", HttpStatus.CREATED);
          //  }
          //  catch (UserAlreadyExistException exception){
               // responseEntity=new ResponseEntity<String>(exception.getMessage(),HttpStatus.CONFLICT);
          //  }
            return responseEntity;

        }

        @DeleteMapping("/user/{id}")
    public ResponseEntity<?> getDeleteUser( @PathVariable("id") String id){
            ResponseEntity responseEntity;
          //  try {

                userService.deleteUser(id);
                responseEntity = new ResponseEntity<String>("delete", HttpStatus.CREATED);
          //  } catch (TrackNotFoundException e) {
              //  responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
           // }
            return responseEntity;

        }
    }

