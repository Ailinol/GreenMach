package com.example.greenMach.Service;

import com.example.greenMach.dtos.CreateUserDTO;
import com.example.greenMach.model.User;
import com.example.greenMach.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public User saveUser(CreateUserDTO createUserDTO)
    {
        var user = new User();
        BeanUtils.copyProperties(createUserDTO, user);
        return userRepository.save(user);
    }

}
