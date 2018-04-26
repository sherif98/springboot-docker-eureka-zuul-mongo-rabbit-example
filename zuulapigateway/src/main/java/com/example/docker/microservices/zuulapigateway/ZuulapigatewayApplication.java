package com.example.docker.microservices.zuulapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@RibbonClient(name = "ribbonConfigs", configuration = RibbonConfig.class)
public class ZuulapigatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulapigatewayApplication.class, args);
    }
}
