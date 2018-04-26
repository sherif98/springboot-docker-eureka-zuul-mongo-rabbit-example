package com.example.docker.microservices.senderservice.controller;

import com.example.docker.microservices.senderservice.domain.User;
import com.example.docker.microservices.senderservice.event.api.UserCreatedEventDispatcher;
import com.example.docker.microservices.senderservice.event.dto.UserCreatedEvent;
import com.example.docker.microservices.senderservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/user")
public class UserController {

    @Value("${spring.rabbitmq.host}")
    private String rabbitHost;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserCreatedEventDispatcher userCreatedEventDispatcher;

    @GetMapping
    public List<User> findAllUsers() {
        System.out.println(rabbitHost);
        return userRepository.findAll();
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        User createdUser = userRepository.save(user);
        userCreatedEventDispatcher
                .dispatchUserCreatedEvent(
                        UserCreatedEvent.builder()
                                .userId(createdUser.getUserId())
                                .userName(createdUser.getUserName())
                                .build());
        return createdUser;
    }
}
