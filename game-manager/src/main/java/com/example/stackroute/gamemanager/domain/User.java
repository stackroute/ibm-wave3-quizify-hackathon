package com.example.stackroute.gamemanager.domain;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String id;
    private String name;
    private String timeStamp;

}
