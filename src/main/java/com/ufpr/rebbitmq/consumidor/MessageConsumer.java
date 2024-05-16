package com.ufpr.rebbitmq.consumidor;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    private static final String QUEUE_NAME = "message-queue";

    @RabbitListener(queues = QUEUE_NAME)
    public void receiveMessageFromQueue(String message) {
        System.out.println("Received message from queue: " + message);
    }
}
