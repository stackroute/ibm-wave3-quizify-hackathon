package com.stackroute.quizify.signleplayerengine.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class SinglePlayer {
    @Id
    private Game game;
    private List<User> users;
}
