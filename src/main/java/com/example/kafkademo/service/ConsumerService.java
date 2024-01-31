package com.example.kafkademo.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "sending_toipc", groupId = "sending_group")
    public void listenToTopic(String receivedMessage){
        System.out.println("This message is received " + receivedMessage);
    }
}
