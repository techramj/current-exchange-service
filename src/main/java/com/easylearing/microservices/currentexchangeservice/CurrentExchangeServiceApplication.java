package com.easylearing.microservices.currentexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class CurrentExchangeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrentExchangeServiceApplication.class, args);
    }

}
