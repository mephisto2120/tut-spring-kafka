package com.tryton.tut.tut_spring_kafka.service;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@CommonsLog
public class Consumer {
    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) {
        log.info(String.format("Consumed message: %s", message));
    }
}
