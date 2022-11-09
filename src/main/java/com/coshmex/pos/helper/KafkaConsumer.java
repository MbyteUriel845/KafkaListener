package com.coshmex.pos.helper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "quickstart-events")
    public void listener(String message) {
        log.debug("Message received {} ", message);
    }
}