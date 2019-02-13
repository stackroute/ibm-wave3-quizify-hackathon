package com.stackroute.quizify.questionmanager.exception.categoryExceptions;

public class CategoryAlreadyExistsException extends Exception {
    private String message;

    public CategoryAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }
}
