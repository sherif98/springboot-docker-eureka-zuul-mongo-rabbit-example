package com.example.docker.microservices.receiverservice.event.receive;

import com.example.docker.microservices.receiverservice.domain.User;
import com.example.docker.microservices.receiverservice.event.dto.UserCreatedEvent;
import com.example.docker.microservices.receiverservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(UserCreatedSink.class)
public class UserCreatedEventListener {

    @Autowired
    private UserRepository userRepository;

    @StreamListener(UserCreatedSink.INPUT)
    public void handleUserCreatedEvent(UserCreatedEvent userCreatedEvent) {
        System.out.println("received event " + userCreatedEvent);
        User user = User.builder()
                .userId(userCreatedEvent.getUserId())
                .userName(userCreatedEvent.getUserName())
                .build();
        userRepository.save(user);
    }
}
