package com.stackroute.quizify.questionmanager.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "topics")
@Data
public class Topic {
    @Id
    private String id;
    private String name;
    private List<String> subTopicNames;
    private List<Question> questions;
}
