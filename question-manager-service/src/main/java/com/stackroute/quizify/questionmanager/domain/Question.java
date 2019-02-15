package com.stackroute.quizify.questionmanager.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "questions")
@Data
public class Question {
    @Id
    private String id;
    private Category category;
    private Topic topic;
    private String level;
    private String type;
    private String statement;
    private List<String> options;
    private String answer;
    private Admin admin;
}
