package com.desafio.picpay.desafiopicpay.dto;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String cpf, String email, String password) {
}
