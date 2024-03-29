package ofer.stempler.kafka.springbootwithkafka.services;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Log4j2
public class Consumer {

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) throws IOException {

        log.info(String.format("#### -> Consumed message -> %s", message));
    }
}
