package com.stackroute.quizify.questionmanager.exception.categoryExceptions;

public class CategoryDoesNotExistException extends Exception {
    private String message;

    public CategoryDoesNotExistException(String message) {
        super(message);
        this.message = message;
    }
}
