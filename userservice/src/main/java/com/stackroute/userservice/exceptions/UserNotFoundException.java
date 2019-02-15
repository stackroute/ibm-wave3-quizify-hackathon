package com.stackroute.userservice.exceptions;

//public class UpdateException extends Exception {
//    private String message;
//    public UpdateException(){}
//
//    public UpdateException(String message){
//        super(message);
//        this.message=message;
//    }
//}

public class UserNotFoundException extends Exception
{
    private String message1;

    public UserNotFoundException(String message1)
    {
        super(message1);
        this.message1 = message1;
    }

    public UserNotFoundException()
    {
        super();
    }
}
