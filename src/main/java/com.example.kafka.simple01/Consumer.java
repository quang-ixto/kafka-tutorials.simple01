package com.example.kafka.simple01;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@EnableKafka
@Component
public class Consumer {

    @KafkaListener(topics = "${kafka.topicName}", groupId = "${kafka.groupId}", containerFactory = "kafkaListenerContainerFactory")
    public void consumer(String message) {
        System.out.println("Received message: " + message);
    }
}
