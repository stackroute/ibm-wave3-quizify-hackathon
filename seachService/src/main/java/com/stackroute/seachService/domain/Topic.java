package com.stackroute.seachService.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Topic {
    @Id
    private String id;
    private String name;
    private String imageUrl;
    private List<Topic> subTopics;
    private Level levels;
    private Admin admin;
}
