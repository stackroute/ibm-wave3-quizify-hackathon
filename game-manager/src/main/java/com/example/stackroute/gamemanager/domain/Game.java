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
    private List<Question> questions;
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
                ", questions=" + questions +
                ", admin=" + admin +
                ", topic=" + topic +
                ", level='" + level + '\'' +
                '}';
    }

}
