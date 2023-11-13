package com.desafio.picpay.desafiopicpay.model;

import com.desafio.picpay.desafiopicpay.dto.UserDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String cpf;
    @Column(unique = true)
    private String email;
    private String password;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private UserType userType;

    public User(UserDTO userDTO){
        firstName = userDTO.firstName();
        lastName = userDTO.lastName();
        cpf = userDTO.cpf();
        email = userDTO.email();
        password = userDTO.password();
        balance = userDTO.balance();
        userType = userDTO.userType();
    }

}
