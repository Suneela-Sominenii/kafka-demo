package com.example.kafkademo.controller;

import com.example.kafkademo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerForKafkaMsg {

    @Autowired
    ProducerService producerService;
    @GetMapping("/produceMsg")
    public void getMessageFromClient(@RequestParam("message") String message){
        producerService.sendMsgToTopic(message);
    }


}
