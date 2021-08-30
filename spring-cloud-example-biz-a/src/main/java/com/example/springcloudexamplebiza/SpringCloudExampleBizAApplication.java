package com.example.springcloudexamplebiza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudExampleBizAApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudExampleBizAApplication.class, args);
    }

}
