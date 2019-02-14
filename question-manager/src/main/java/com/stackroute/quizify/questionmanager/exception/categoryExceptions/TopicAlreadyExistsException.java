package com.stackroute.quizify.questionmanager.exception.categoryExceptions;

public class TopicAlreadyExistsException extends Exception {
    private String message;

    public  TopicAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }
}
