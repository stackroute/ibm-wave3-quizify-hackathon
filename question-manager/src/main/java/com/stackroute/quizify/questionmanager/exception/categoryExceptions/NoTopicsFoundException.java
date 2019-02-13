package com.stackroute.quizify.questionmanager.exception.categoryExceptions;

public class NoTopicsFoundException extends Exception {
    private String message;

    public  NoTopicsFoundException(String message) {
        super(message);
        this.message = message;
    }
}
