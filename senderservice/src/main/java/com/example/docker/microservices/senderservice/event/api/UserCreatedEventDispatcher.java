package com.example.docker.microservices.senderservice.event.api;

import com.example.docker.microservices.senderservice.event.dto.UserCreatedEvent;

public interface UserCreatedEventDispatcher {

    void dispatchUserCreatedEvent(UserCreatedEvent userCreatedEvent);
}
