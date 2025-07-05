package com.gstech.Notificacoesdistribuidas.domain;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_notification_record")
public class NotificationRecord {

    @Id
    private UUID id;
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_notification")
    private Notification idNotification;


    public NotificationRecord() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Notification getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(Notification idNotification) {
        this.idNotification = idNotification;
    }
}
