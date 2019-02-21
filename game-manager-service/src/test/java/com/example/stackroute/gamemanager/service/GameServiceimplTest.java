//package com.example.stackroute.gamemanager.service;
//
//import com.example.stackroute.gamemanager.domain.*;
//import com.example.stackroute.gamemanager.exception.GameAlreadyExists;
//import com.example.stackroute.gamemanager.exception.GameNotFound;
//import com.example.stackroute.gamemanager.repository.GameRepository;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.doNothing;
//import static org.mockito.Mockito.doReturn;
//
//
//public class GameServiceimplTest  {
//
//
//    @Mock
//    GameRepository gameRepository;
//    Topic topic;
//    Admin admin;
//    Game gameobj;
//    Category category;
//    Question question;
//
//    @InjectMocks
//    GameService gameService;
//
//    @Before
//    public void setUp() throws Exception {
//        category=new Category();
//        question= new Question();
//    }
//
//    @After
//    public void tearDown() throws Exception {
//
//    }
//
//
//
//
//    @Test
//    public void saveGame() throws GameAlreadyExists {
//
//
//        List<Question> questions =new ArrayList<>();
//        questions.add(question);
//
//        Game game = new Game("g1","game1",category,20,"easy",questions,admin,topic);
//        doReturn(false).when(gameRepository).existsById(game.getId());
//        doReturn(game).when(gameRepository).save(game);
//        assertEquals(gameService.saveGame(game),game);
//    }
//
//    @Test
//    public void deleteGame() throws GameNotFound {
//
//        List<Question> questions =new ArrayList<>();
//        questions.add(question);
//
//        Game game = new Game("g1","game1",category,3,"easy",questions,admin,topic);
//        doReturn(true).when(gameRepository).existsById(game.getId());
//        doNothing().when(gameRepository).deleteById(game.getId());
//        assertEquals(gameService.deleteGame("2"), "2");
//    }
//
//    @Test
//    public void updateGame() throws GameNotFound{
//
//        List<Question> questions =new ArrayList<>();
//        questions.add(question);
//
//        Game game = new Game("g1","game1",category,3,"easy",questions,admin,topic);
//        doReturn(true).when(gameRepository).existsById(game.getId());
//        doReturn(game).when(gameRepository).findById(game.getId());
//        doReturn(game).when(gameRepository).save(game);
//        assertEquals(gameService.updateGame(game), game);
//    }
//}