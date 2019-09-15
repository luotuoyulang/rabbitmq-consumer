package cn.luotuoyulang.rabbitmqconsumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component

public class FanoutEamilConsumer {

    @RabbitHandler
    @RabbitListener(queues = "fanout_eamil_queue")
    public void process(String msg) throws Exception {
        System.out.println("邮件消费者获取生产者消息msg:" + msg);
    }
}
