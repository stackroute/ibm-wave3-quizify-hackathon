package com.example.stackroute.gamemanager.domain;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;


@Data
@Document(collection="game")
public class Game {

    @Id
   private String id;
    private String name;
    private String timelimit;
   private Topic[] topic;

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", timelimit='" + timelimit + '\'' +
                ", topic=" + Arrays.toString(topic) +
                ", level='" + level + '\'' +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }

    private  String level;
    private Question[] questions;
}
