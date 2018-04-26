package com.example.docker.microservices.senderservice.event.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserCreatedEvent {

    private String userId;
    private String userName;
}
