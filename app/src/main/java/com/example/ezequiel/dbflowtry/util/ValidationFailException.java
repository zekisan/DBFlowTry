package com.example.ezequiel.dbflowtry.util;

public class ValidationFailException extends RuntimeException{

    public ValidationFailException(){}

    public ValidationFailException(String message){
        super(message);
    }

}
