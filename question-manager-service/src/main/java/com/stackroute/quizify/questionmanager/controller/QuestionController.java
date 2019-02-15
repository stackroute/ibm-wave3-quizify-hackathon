package com.stackroute.quizify.questionmanager.controller;

import com.stackroute.quizify.questionmanager.domain.Category;
import com.stackroute.quizify.questionmanager.domain.Question;
import com.stackroute.quizify.questionmanager.exception.NoQuestionFoundException;
import com.stackroute.quizify.questionmanager.exception.QuestionAlreadyExistsException;
import com.stackroute.quizify.questionmanager.exception.QuestionDoesNotExistException;
import com.stackroute.quizify.questionmanager.service.QuestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
@Api(description="Question Manager Service")
public class QuestionController {

    private QuestionService questionService;
    private ResponseEntity<?> responseEntity;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @ApiOperation(value = "Add Question")
    @PostMapping("/questions/question")
    public ResponseEntity<?> saveQuestion(@RequestBody Question question) {
        try {
            return new ResponseEntity<Question>(this.questionService.addNewQuestion(question), HttpStatus.OK);
        } catch (QuestionAlreadyExistsException e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @ApiOperation(value = "Update Question")
    @PutMapping("/questions/question")
    public ResponseEntity<?> updateQuestion(@RequestBody Question question) {
        try {
            return new ResponseEntity<Question>(this.questionService.updateQuestion(question), HttpStatus.OK);
        } catch (QuestionDoesNotExistException e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @ApiOperation(value = "Remove Category")
    @DeleteMapping("/questions/question")
    public ResponseEntity<?> removeQuestion(@RequestBody Question question) {
        try {
            return new ResponseEntity<Question>(this.questionService.removeQuestion(question), HttpStatus.OK);
        } catch (QuestionDoesNotExistException e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @ApiOperation(value = "Get Questions")
    @GetMapping("/categories/{categoryName}/{topicName}/{level}/{numOfQuestions}")
    public ResponseEntity<?> getQuestions(@PathVariable String categoryName, @PathVariable String topicName, @PathVariable String level, @PathVariable int numOfQuestions) {
        System.out.println(categoryName);
        System.out.println(topicName);
        System.out.println(level);
        System.out.println(numOfQuestions);
        try {
            return new ResponseEntity<List<Question>>(this.questionService.getQuestion(categoryName, topicName, level, numOfQuestions), HttpStatus.OK);
        } catch (NoQuestionFoundException e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @ApiOperation(value = "Get All Questions")
    @GetMapping("/categories/{categoryName}/{topicName}")
    public ResponseEntity<?> getAllQuestions(@PathVariable String categoryName, @PathVariable String topicName) {
        System.out.println(categoryName);
        System.out.println(topicName);
        try {
            return new ResponseEntity<List<Question>>(this.questionService.getAllQuestions(categoryName, topicName), HttpStatus.OK);
        } catch (NoQuestionFoundException e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


}
