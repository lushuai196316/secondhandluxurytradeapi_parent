package com.newbee.secondhandluxurytrade.secondhandluxurytradeapi_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SecondhandluxurytradeapiEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondhandluxurytradeapiEurekaApplication.class, args);
    }

}
