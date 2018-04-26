package com.example.docker.microservices.senderservice.event.impl;

import com.example.docker.microservices.senderservice.event.api.UserCreatedEventDispatcher;
import com.example.docker.microservices.senderservice.event.dto.UserCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(UserCreatedEventSource.class)
public class UserCreatedEventDispatcherImpl implements UserCreatedEventDispatcher {

    @Autowired
    private UserCreatedEventSource userCreatedEventSource;

    @Override
    public void dispatchUserCreatedEvent(UserCreatedEvent userCreatedEvent) {
        System.out.println("sending event " + userCreatedEvent);
        userCreatedEventSource.userCreated().send(MessageBuilder.withPayload(userCreatedEvent).build());
    }
}
