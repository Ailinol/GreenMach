package com.example.greenMach.controller;

import com.example.greenMach.Service.UserService;
import com.example.greenMach.dtos.CreateUserDTO;
import com.example.greenMach.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @Autowired
    UserService userService;

    @PostMapping("/cadastro")
    public ResponseEntity<User>  saveUser(@RequestBody @Valid CreateUserDTO createUserDTO)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(createUserDTO));
    }
}
