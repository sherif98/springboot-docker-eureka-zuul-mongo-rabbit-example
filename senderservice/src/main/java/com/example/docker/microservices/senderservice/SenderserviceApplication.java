package com.example.docker.microservices.senderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SenderserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SenderserviceApplication.class, args);
    }
}
