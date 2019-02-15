package com.stackroute.quizify.questionmanager.service;

import com.stackroute.quizify.questionmanager.domain.Question;
import com.stackroute.quizify.questionmanager.exception.NoQuestionFoundException;
import com.stackroute.quizify.questionmanager.exception.QuestionAlreadyExistsException;
import com.stackroute.quizify.questionmanager.exception.QuestionDoesNotExistException;

import java.util.List;

public interface QuestionService {
    Question addNewQuestion(Question question) throws QuestionAlreadyExistsException;
    Question updateQuestion(Question question) throws QuestionDoesNotExistException;
    Question removeQuestion(Question question) throws QuestionDoesNotExistException;

    List<Question> getQuestion(String categoryName, String topicName, String level, int numOfQuestions) throws NoQuestionFoundException;
}
