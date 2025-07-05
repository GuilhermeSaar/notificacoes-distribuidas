package com.gstech.Notificacoesdistribuidas.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gstech.Notificacoesdistribuidas.DTO.NotificationJsonDTO;
import com.gstech.Notificacoesdistribuidas.domain.Notification;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NotificationProducer{

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange}")
    private String exchange;
    @Value("${rabbitmq.routingKeys.email}")
    private String routingKeyEmail;


    public void publisherNotificationCreated(Notification notification) {

        try {
            var payload = new NotificationJsonDTO();
            payload.setId(notification.getId());
            payload.setNotificationType(notification.getNotificationType());
            payload.setRecipient(notification.getRecipient());
            payload.setTitle(notification.getTitle());
            payload.setText_content(notification.getText_content());


            String json = objectMapper.writeValueAsString(payload);

            rabbitTemplate.convertAndSend(exchange, routingKeyEmail, json);

        } catch (JsonProcessingException e) {
            System.err.println("Erro ao serializar notificao");
        }
    }
}
