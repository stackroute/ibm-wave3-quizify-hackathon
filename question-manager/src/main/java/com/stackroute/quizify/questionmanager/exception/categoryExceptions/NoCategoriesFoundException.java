package com.stackroute.quizify.questionmanager.exception.categoryExceptions;

public class NoCategoriesFoundException extends Exception {
    private String message;

    public NoCategoriesFoundException(String message) {
        super(message);
        this.message = message;
    }
}
