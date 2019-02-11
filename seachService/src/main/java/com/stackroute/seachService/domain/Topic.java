package com.stackroute.seachService.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Topic {
    @Id
    private String id;
    private String name;
    private Topic[] subtopics;
    private Question[] questions;
}
