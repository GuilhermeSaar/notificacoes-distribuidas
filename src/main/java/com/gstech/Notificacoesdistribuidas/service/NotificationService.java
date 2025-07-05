package com.gstech.Notificacoesdistribuidas.service;

import com.gstech.Notificacoesdistribuidas.DTO.NotificationDTO;
import com.gstech.Notificacoesdistribuidas.domain.Notification;
import com.gstech.Notificacoesdistribuidas.producer.NotificationProducer;
import com.gstech.Notificacoesdistribuidas.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;
    @Autowired
    private NotificationProducer notificationProducer;


    @Transactional
    public void createNotification(NotificationDTO data) {

        var newNotification = new Notification();
        newNotification.setId(UUID.randomUUID());
        newNotification.setNotificationType(data.notificationType());
        newNotification.setRecipient(data.recipient());
        newNotification.setTitle(data.title());
        newNotification.setText_content(data.text_content());

        notificationRepository.save(newNotification);

        notificationProducer.publisherNotificationCreated(newNotification);

    }

}
