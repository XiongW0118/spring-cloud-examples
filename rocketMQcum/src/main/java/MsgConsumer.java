import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

@Slf4j
public class MsgConsumer {
    public static void main(String[] args) throws Exception {
        //创建消息消费者
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("myconsumer-group");
        //设置NameServer
        consumer.setNamesrvAddr("localhost:9876");
        //指定订阅的主题和标签
        consumer.subscribe("myTopic","*");
        //回调函数  创建了一个消息监听器，一直监听消息队列中的消息
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                log.info("Message=>{}",new String(list.get(0).getBody()));
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        //启动消费者
        consumer.start();
    }
}
