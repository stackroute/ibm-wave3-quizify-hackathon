package com.example.stackroute.gamemanager.repository;

import com.example.stackroute.gamemanager.domain.Game;
import com.example.stackroute.gamemanager.domain.Question;
import com.example.stackroute.gamemanager.domain.Topic;
import com.example.stackroute.gamemanager.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class GameRepositoryTest {

    @Before
    public void setUp() throws Exception {

    }

    @Autowired
    GameRepository gameRepository;

    Game game;
    Topic topic;
    Question que;


    @Test
    public void saveGametest(){

        User user1 = game.getUser();

        List<String> subTopics = new ArrayList<>();
        List<Question> questions = new ArrayList<>();
        subTopics.add("java");
        subTopics.add("polymorphism");
        subTopics.add("spring");
        subTopics.add("hibernate");




         topic = new Topic("topic1","topicname",subTopics,questions);

        game = new Game("g1","game1","60",topic,3,"easy",que,user1);

        gameRepository.save(game);

        Optional retrivedGame = gameRepository.findById(game.getId());

        assertEquals(game,retrivedGame);

    }
}