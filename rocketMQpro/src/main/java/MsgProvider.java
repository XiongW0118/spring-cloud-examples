import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.nio.charset.StandardCharsets;

public class MsgProvider {
    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer("myproducer-group");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        Message message = new Message("myTopic", "myTag", ("Test MQ").getBytes(StandardCharsets.UTF_8));
        SendResult result = producer.send(message, 6000);
        System.out.println(result);
        producer.shutdown();
    }
}
