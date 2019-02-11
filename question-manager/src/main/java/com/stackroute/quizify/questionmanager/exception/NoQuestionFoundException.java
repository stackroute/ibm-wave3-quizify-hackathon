package com.stackroute.quizify.questionmanager.exception;

public class NoQuestionFoundException extends Exception {
    private String message;

    public  NoQuestionFoundException(String message) {
        super(message);
        this.message = message;
    }

}
