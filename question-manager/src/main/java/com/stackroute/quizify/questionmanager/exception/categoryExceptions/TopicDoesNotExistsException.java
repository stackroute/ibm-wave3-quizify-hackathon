package com.stackroute.quizify.questionmanager.exception.categoryExceptions;

public class TopicDoesNotExistsException extends Exception {
    private String message;

    public  TopicDoesNotExistsException(String message) {
        super(message);
        this.message = message;
    }
}
