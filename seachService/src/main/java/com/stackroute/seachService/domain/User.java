package com.stackroute.seachService.domain;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;
    private String name;
    private String timeStamp;
}
