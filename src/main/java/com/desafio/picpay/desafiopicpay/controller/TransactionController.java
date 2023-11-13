package com.desafio.picpay.desafiopicpay.controller;

import com.desafio.picpay.desafiopicpay.dto.TransactionDTO;
import com.desafio.picpay.desafiopicpay.model.Transaction;
import com.desafio.picpay.desafiopicpay.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO transactionDTO) throws Exception {
        Transaction newTransaction = transactionService.createTransaction(transactionDTO);
        return new ResponseEntity<>(newTransaction, HttpStatus.OK);
    }
}
