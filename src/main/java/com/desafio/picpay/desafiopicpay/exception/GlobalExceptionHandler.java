package com.desafio.picpay.desafiopicpay.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDataIntegrityViolationException() {
        return new ResponseEntity<>("User already registered, please insert a new one!", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserTypeUnauthorizedException.class)
    public ResponseEntity<String> handleUserTypeUnauthorizedException() {
        return new ResponseEntity<>("Your user type is not allowed to perform transactions!", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handleUserNotFoundException() {
        return new ResponseEntity<>("User not found!", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(TransactionBlockedByPicPayException.class)
    public ResponseEntity<String> handleTransactionBlockedByPicPayException() {
        return new ResponseEntity<>("Your transaction was blocked by pic pay", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnableToSendNotificationException.class)
    public ResponseEntity<String> handleUnableToSendNotificationException() {
        return new ResponseEntity<>("Unable to send notification", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InsufficientBalanceException.class)
    public ResponseEntity<String> handleInsufficientBalanceException() {
        return new ResponseEntity<>("Insufficient Balance", HttpStatus.BAD_REQUEST);
    }
}
