package com.stackroute.seachService.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Question {

    @Id
    private String id;
    private String type;
    private String statement;
    private List<String> options;
    private String answer;
    private Admin admin;

}
