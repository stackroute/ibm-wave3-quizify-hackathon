package com.stackroute.quizify.recommendationservice.domain;

import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RelationshipEntity(type = "LikesTopic")
public class LikesTopic {
    @Id
    @GeneratedValue
    private String id;

    private List<String> Topics=new ArrayList<>();

    @StartNode
    private User user;
    @EndNode
    private Topic topic;
}
