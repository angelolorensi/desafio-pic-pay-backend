package com.desafio.picpay.desafiopicpay.dto;

import com.desafio.picpay.desafiopicpay.model.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String cpf, String email, String password, UserType userType, BigDecimal balance) {
}
