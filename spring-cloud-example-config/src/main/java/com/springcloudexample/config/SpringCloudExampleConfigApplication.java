package com.springcloudexample.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableConfigServer
@EnableFeignClients
public class SpringCloudExampleConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudExampleConfigApplication.class, args);
    }

}
