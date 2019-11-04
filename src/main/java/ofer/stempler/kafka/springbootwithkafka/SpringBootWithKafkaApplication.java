package ofer.stempler.kafka.springbootwithkafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootWithKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithKafkaApplication.class, args);
    }

}
