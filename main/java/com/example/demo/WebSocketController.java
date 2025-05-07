package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @Autowired
    private RecordRepository repository;

    @MessageMapping("/record") // client sends to /app/record
    @SendTo("/topic/records")  // broadcast to all subscribers
    public RecordMessage handleRecord(RecordMessage message) {
        Record record = new Record();
        record.setName(message.getName());
        record.setValue(message.getValue());
        repository.save(record);
        return message;
    }
}
