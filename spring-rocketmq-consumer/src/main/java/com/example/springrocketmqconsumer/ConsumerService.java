package com.example.springrocketmqconsumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service                          //消息监听 consumerGroup ：消费组名称，topic=主题
@RocketMQMessageListener(consumerGroup = "myConsumer",topic = "orderTopic")
public class ConsumerService implements RocketMQListener<Order> {
    @Override
    public void onMessage(Order order) {
        log.info("新订单{},发短信",order);
        //如果能拿到新的订单，那就根据订单id生成一个减库存的操作，无非就是操作数据库

        System.out.println("需要执行减库存的操作.....");
    }
}

