package com.example.greenMach.repositories;

import com.example.greenMach.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    //Busca por nome
    //Optional<User> fidByFullName(String name);

    //Busca por id
   // Optional<User> fidById(Long id);
}
