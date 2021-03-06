package com.stackroute.quizify.recommendationservice.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Category{
    @Id
    private long id;
    private String name;
    private String imageUrl;
    private String timeStamp;
    private Admin admin;

}