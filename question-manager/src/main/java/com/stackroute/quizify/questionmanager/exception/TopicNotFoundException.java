package com.stackroute.quizify.questionmanager.exception;

public class TopicNotFoundException extends Exception {
    private String message;

    public  TopicNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
