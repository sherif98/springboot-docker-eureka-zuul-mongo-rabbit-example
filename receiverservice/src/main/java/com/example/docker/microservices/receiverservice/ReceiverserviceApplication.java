package com.example.docker.microservices.receiverservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ReceiverserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReceiverserviceApplication.class, args);
    }
}
