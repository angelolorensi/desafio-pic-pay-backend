package com.desafio.picpay.desafiopicpay.service;

import com.desafio.picpay.desafiopicpay.dto.UserDTO;
import com.desafio.picpay.desafiopicpay.exception.InsufficientBalanceException;
import com.desafio.picpay.desafiopicpay.exception.UserNotFoundException;
import com.desafio.picpay.desafiopicpay.exception.UserTypeUnauthorizedException;
import com.desafio.picpay.desafiopicpay.model.User;
import com.desafio.picpay.desafiopicpay.model.UserType;
import com.desafio.picpay.desafiopicpay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void validateTransaction(User sender, BigDecimal value) throws Exception{

        if(sender.getUserType() == UserType.MERCHANT){
            throw new UserTypeUnauthorizedException();
        }

        if(sender.getBalance().compareTo(value) < 0){
            throw new InsufficientBalanceException();
        }

    }

    public User getUserById(Long id){
        return userRepository.findUserById(id).orElseThrow(UserNotFoundException::new);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User createUser(UserDTO userDTO){
        User newUser = new User(userDTO);
        saveUser(newUser);
        return newUser;
    }

    public void saveUser(User user){
        userRepository.save(user);
    }

}
