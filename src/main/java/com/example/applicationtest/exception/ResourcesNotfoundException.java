package com.example.applicationtest.exception;

public class ResourcesNotfoundException extends RuntimeException{
    public ResourcesNotfoundException(String message){
        super(message);
    }
}
