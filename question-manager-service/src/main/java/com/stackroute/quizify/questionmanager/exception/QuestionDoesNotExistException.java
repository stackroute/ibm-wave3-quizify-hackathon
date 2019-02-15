package com.stackroute.quizify.questionmanager.exception;

public class QuestionDoesNotExistException extends Exception {
    private String message;

    public QuestionDoesNotExistException(String message) {
        super(message);
        this.message = message;
    }
}
