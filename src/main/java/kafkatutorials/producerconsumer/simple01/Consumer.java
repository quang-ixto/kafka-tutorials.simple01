package kafkatutorials.producerconsumer.simple01;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@EnableKafka
@Component
public class Consumer {

    @KafkaListener(topics = "MyTopic", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
    public void consumer(String message) {
        System.out.println("Received message: " + message);
    }
}
