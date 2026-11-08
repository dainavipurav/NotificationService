package com.learning.springboot.notificationservice.consumer;

import com.learning.springboot.notificationservice.dto.InvoiceRequestDto;
import com.learning.springboot.notificationservice.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InvoiceEmailConsumer {

    private final NotificationService notificationService;

    @RabbitListener(queues = "invoice.queue")
    public void receiveEmailRequest(InvoiceRequestDto request){
        notificationService.sendEmailNotification(request);
    }

}
