package com.example.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.JsonMessageConverter;

@Configuration
public class JsonMess {
    @Bean
    JsonMessageConverter jsonMessageConverter(){
        return new JsonMessageConverter();
    }
}
