package com.desafio.picpay.desafiopicpay.exception;

public class InsufficientBalanceException extends RuntimeException{

    public InsufficientBalanceException(){
        super("Insufficient Balance");
    }

}
