package com.stackroute.seachService.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "Quizzes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Quiz {
    @Id
    private String id;
    private String name;
    private String timelimit;
    private Topic[] topic;
    private  String level;
    private Question[] questions;

    @Override
    public String toString() {
        return "Quiz{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", timelimit='" + timelimit + '\'' +
                ", topic=" + Arrays.toString(topic) +
                ", level='" + level + '\'' +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }
}
