package com.desafio.picpay.desafiopicpay.repository;

import com.desafio.picpay.desafiopicpay.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {



}
