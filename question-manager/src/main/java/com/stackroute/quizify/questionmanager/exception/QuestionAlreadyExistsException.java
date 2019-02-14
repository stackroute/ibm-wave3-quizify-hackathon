package com.stackroute.quizify.questionmanager.exception;

public class QuestionAlreadyExistsException extends Exception {
    private String message;

    public QuestionAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }
}
