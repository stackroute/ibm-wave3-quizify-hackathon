package com.stackroute.quizify.questionmanager.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Category {
    @Id
    private String name;
    private String imageUrl;
    private String timeStamp;
    private Admin admin;
}
