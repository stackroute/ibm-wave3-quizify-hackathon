package com.stackroute.quizify.questionmanager.exception;

public class QuestionNotFoundException extends Exception {
    private String message;

    public  QuestionNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
