package com.example.stackroute.gamemanager.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Question {

    @Id
    private String id;
    private String type;
    private String statement;
    private String[] options;
    private String answer;
    private String level;
    private int point;
    private User user;
}
