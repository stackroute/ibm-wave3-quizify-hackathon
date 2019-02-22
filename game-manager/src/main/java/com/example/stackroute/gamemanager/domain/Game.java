package com.example.stackroute.gamemanager.domain;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.List;


@Data
@Document(collection="games")
public class Game {

    @Id
    private String id;
    private String name;
    private Category category;
    private int playcount;
    private int quesNum;
    private List<Question> questions;

    public Game(String id, String name, Category category, int playcount, int quesNum, List<Question> questions, Admin admin, Topic topic, String level) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.playcount = playcount;
        this.quesNum = quesNum;
        this.questions = questions;
        this.admin = admin;
        this.topic = topic;
        this.level = level;
    }

    private Admin admin;
    private Topic topic;
    private String level;


    @Override
    public String toString() {
        return "Game{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", playcount=" + playcount +
                ", quesNum=" + quesNum +
                ", questions=" + questions +
                ", admin=" + admin +
                ", topic=" + topic +
                ", level='" + level + '\'' +
                '}';
    }

}
