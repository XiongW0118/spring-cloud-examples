package com.example.springrocketmqprovider.controller;

import com.example.springrocketmqprovider.beans.Order;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ProviderController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("/sendMsg")
    public Order sendMsg(){
        Order order = new Order(
                1,
                "阿松大",
                "123123",
                "软件园",
                new Date()
        );
        this.rocketMQTemplate.convertAndSend("orderTopic",order);
        return order;
    }

}
