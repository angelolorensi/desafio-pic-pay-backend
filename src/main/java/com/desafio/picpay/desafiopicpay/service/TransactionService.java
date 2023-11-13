package com.desafio.picpay.desafiopicpay.service;

import com.desafio.picpay.desafiopicpay.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private UserService userService;

    @Autowired
    private TransactionRepository transactionRepository;

    public void createTransaction(){

    }
}
