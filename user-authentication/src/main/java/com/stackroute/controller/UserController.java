package com.stackroute.controller;

import com.stackroute.domain.User;
import com.stackroute.exceptions.UserNameOrPasswordEmpty;
import com.stackroute.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import java.util.List;


@CrossOrigin(value = "*")
@RequestMapping("api/v1/")
@RestController
public class UserController {
    private UserService userService;
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    public UserController(UserService userService) {

        this.userService = userService;
    }


    @PostMapping("user")
    public ResponseEntity<?> login(@RequestBody User user) throws ServletException {

        // String jwtToken = "";
        //when both un and pwd are null

        ResponseEntity responseEntity;
//        return new ResponseEntity<List<User>>(userService.saveUser(user,HttpStatus.OK));


        // String un=user.getUserid();  //username received
        // String pwd=user.getPassword(); // password received

        try {
            if (user.getUserid().equalsIgnoreCase(" ")|| user.getPassword().equalsIgnoreCase(" ")) {
                logger.warn("Please fill in username and password");
                throw new UserNameOrPasswordEmpty("Please fill in username and password");
            }
            else
            {
                userService.saveUser(user);
                return new ResponseEntity<User>(user, HttpStatus.CREATED);
            }
        }

        catch (UserNameOrPasswordEmpty e) {
            return new ResponseEntity<String>("username or password is empty", HttpStatus.CONFLICT);

        }
    }



    @GetMapping("user")
    public ResponseEntity<?> getAllUser()
    {
        return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
    }






}

