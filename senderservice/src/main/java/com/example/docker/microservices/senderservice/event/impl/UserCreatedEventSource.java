package com.example.docker.microservices.senderservice.event.impl;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface UserCreatedEventSource {

    @Output
    MessageChannel userCreated();
}
