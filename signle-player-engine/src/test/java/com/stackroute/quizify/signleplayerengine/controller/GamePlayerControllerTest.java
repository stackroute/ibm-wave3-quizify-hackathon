package com.stackroute.quizify.signleplayerengine.controller;

import com.stackroute.quizify.signleplayerengine.service.PlayerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class GamePlayerControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PlayerService playerService;

    @InjectMocks
    private GamePlayerController gamePlayerController;




    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(this.gamePlayerController).build();

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void getGame() {
//        this.questions.add(this.question);
//        when(this.questionService.getQuestion((String) any(), (String) any(), (String) any(), anyInt())).thenReturn(this.questions);
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/categories/{categoryName}/{topicName}/{level}/{numOfQuestions}", this.category.getName(), this.topicMovies.getName(), "easy", 1)
//                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(this.questions)))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print());
    }

}