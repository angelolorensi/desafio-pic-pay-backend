package com.desafio.picpay.desafiopicpay.service;

import com.desafio.picpay.desafiopicpay.model.User;
import com.desafio.picpay.desafiopicpay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void validateTransaction(User sender, BigDecimal value){

        if(sender.getBalance().compareTo(value) > 0){

        }

    }

}
