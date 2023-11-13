package com.desafio.picpay.desafiopicpay.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
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
    private UserType userType;

}
