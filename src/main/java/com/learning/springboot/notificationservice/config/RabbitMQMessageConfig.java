package com.learning.springboot.notificationservice.config;

import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tools.jackson.databind.json.JsonMapper;

@Configuration
public class RabbitMQMessageConfig {

    @Bean
    public MessageConverter messageConverter() {
        return new JacksonJsonMessageConverter(JsonMapper.builder().build());
    }
}
