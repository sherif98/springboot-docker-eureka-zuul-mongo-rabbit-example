package com.example.docker.microservices.receiverservice.event.receive;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface UserCreatedSink {

    String INPUT = "userCreated";

    @Input("userCreated")
    SubscribableChannel userCreatedChannel();
}
