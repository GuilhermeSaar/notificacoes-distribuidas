package com.gstech.Notificacoesdistribuidas.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gstech.Notificacoesdistribuidas.DTO.NotificationJsonDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @Autowired
    private ObjectMapper objectMapper;


    @RabbitListener(queues = "${rabbitmq.queues.email}")
    public void handlerNotificationCreated(String message) {

        try {

            var dataJson = objectMapper.readValue(message, NotificationJsonDTO.class);

            System.out.println("Evento recebido no Worker: " + dataJson);

        } catch (JsonProcessingException e ) {
            System.err.println(e.getMessage());
        }
    }
}
