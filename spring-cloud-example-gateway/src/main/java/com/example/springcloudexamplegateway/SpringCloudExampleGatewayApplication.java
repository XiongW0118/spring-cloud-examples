package com.example.springcloudexamplegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudExampleGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudExampleGatewayApplication.class, args);
    }

}
