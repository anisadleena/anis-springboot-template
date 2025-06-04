package com.example.Banking.model;

import java.time.LocalDateTime;
import java.util.Date;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="customer")
@Getter
@Setter
public class Customer {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    @Column(name="username")
    private String username;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
    @Column(name="password")
    private String password;
    @Column(name="dob")
    private String dob;
    @Column(name="address")
    private String address;
    @Column(name="verification_id")
    private String verificationId;
    @Column(name="occupation")
    private String occupation;
    @Column(name="income")
    private String income;
    @Column(name="created_date", updatable = false)
    private LocalDateTime createdDate = LocalDateTime.now();
    @Column(name="updated_date")
    private LocalDateTime updatedDate;

}
