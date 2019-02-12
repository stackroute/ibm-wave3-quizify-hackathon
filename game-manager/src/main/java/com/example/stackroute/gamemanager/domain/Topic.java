package com.example.stackroute.gamemanager.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Topic {

    @Id
    private String id;
    private String name;
    private List<String> subTopicNames;
    private List<Question> questions;
    private User user;
}
