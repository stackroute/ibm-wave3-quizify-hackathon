package com.stackroute.quizify.signleplayerengine.domain;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Game {
    @Id
    private String id;
    private String name;
    private Category category;
    private Topic topic;
    private int playCount;
    private int numOfQuestion;
    private List<Question> questions;
    private Admin admin;
    private String level;


}
