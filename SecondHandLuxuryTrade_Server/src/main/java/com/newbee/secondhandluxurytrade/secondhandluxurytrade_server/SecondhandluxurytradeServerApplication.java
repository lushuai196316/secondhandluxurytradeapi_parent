package com.newbee.secondhandluxurytrade.secondhandluxurytrade_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecondhandluxurytradeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondhandluxurytradeServerApplication.class, args);
    }

}
