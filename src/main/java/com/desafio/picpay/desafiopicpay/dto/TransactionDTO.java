package com.desafio.picpay.desafiopicpay.dto;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long senderId, Long receiverId) {
}
