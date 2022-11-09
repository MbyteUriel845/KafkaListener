package com.coshmex.pos.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final String kafkaTopic = "quickstart-events";

    public void send(String message) {

        kafkaTemplate.send(kafkaTopic, message);
    }

}
