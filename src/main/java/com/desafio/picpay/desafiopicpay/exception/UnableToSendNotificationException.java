package com.desafio.picpay.desafiopicpay.exception;

public class UnableToSendNotificationException extends RuntimeException{

    public UnableToSendNotificationException(){
        super("Unable to send notification");
    }

}
