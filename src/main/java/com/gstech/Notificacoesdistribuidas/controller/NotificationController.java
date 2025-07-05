package com.gstech.Notificacoesdistribuidas.controller;

import com.gstech.Notificacoesdistribuidas.NotificationDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationController {


    @PostMapping
    public ResponseEntity<NotificationDTO> receiveNotificationSendingRequest(@RequestBody NotificationDTO data) {

        System.out.println("Notificacao enviada!");
        return ResponseEntity.ok().body(data);
    }
}
