package com.learning.springboot.notificationservice.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class InvoiceMessageConsumer {

//    @RabbitListener(queues = "invoice.queue")
//    public void receiveMessage(String message) {
//
//        System.out.println("Message received from RabbitMQ: " + message);
//
//        throw new RuntimeException(
//                "Email service is unavailable!"
//        );
//
//        // Later:
//        // 1. Process invoice information
//        // 2. Send notification
//        // 3. Call EmailService
//    }
}
