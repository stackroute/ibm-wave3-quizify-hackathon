package com.stackroute.quizify.questionmanager.exception;

public class TopicNameExistsException extends Exception {
    private String message;

    public  TopicNameExistsException(String message) {
        super(message);
        this.message = message;
    }
}
