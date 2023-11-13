package com.desafio.picpay.desafiopicpay.exception;

public class UserTypeUnauthorizedException extends RuntimeException{

    public UserTypeUnauthorizedException(){
        super("Your user type is not allowed to perform transactions!");
    }

}
