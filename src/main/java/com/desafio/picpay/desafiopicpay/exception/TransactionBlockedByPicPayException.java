package com.desafio.picpay.desafiopicpay.exception;

public class TransactionBlockedByPicPayException extends RuntimeException{

    public TransactionBlockedByPicPayException(){
        super("Your transaction was blocked by pic pay");
    }

}
