package com.example.docker.microservices.receiverservice.controller;

import com.example.docker.microservices.receiverservice.domain.User;
import com.example.docker.microservices.receiverservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/copy")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }

}
