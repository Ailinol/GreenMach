package com.example.greenMach.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "USER")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    private String password_hash;
    private String phone_number;
    private String full_name;
    private boolean is_email_verified;
    private boolean is_active;
    private String fcm_token;
    private String reset_password_token;
    private LocalDateTime token_expiry;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
