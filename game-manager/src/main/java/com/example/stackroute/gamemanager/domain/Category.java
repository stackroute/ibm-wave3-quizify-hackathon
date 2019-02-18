package com.example.stackroute.gamemanager.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class Category{
    @Id
    private String name;
    private String imageUrl;
    private long timeStamp;
    private Admin admin;


}