package com.stackroute.seachService.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.List;

@Document(collection = "Quizzes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Game {
    @Id
    private String id;
    private String name;
    private List<Topic> topic;
    private int playcount;
    private  String level;
    private List<Question> questions;
    private User user;

}
