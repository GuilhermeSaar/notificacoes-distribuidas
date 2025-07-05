package com.gstech.Notificacoesdistribuidas.controller;

import com.gstech.Notificacoesdistribuidas.DTO.NotificationDTO;
import com.gstech.Notificacoesdistribuidas.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationController {

    @Autowired
    NotificationService notificationService;


    @PostMapping
    public ResponseEntity<NotificationDTO> receiveNotificationSendingRequest(@RequestBody NotificationDTO data) {

        notificationService.createNotification(data);
        System.out.println("Notificacao enviada!");
        return ResponseEntity.ok().body(data);
    }
}
