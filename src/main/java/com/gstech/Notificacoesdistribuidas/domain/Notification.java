package com.gstech.Notificacoesdistribuidas.domain;

import com.gstech.Notificacoesdistribuidas.enums.NotificationType;
import com.gstech.Notificacoesdistribuidas.enums.Recipient;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tb_notification")
public class Notification {

    @Id
    private UUID id;
    private NotificationType notificationType;
    private Recipient recipient;
    private String title;
    private String text_content;

    public Notification() {
    }

    public Notification(UUID id, NotificationType notificationType, Recipient recipient, String title, String text_content) {
        this.id = id;
        this.notificationType = notificationType;
        this.recipient = recipient;
        this.title = title;
        this.text_content = text_content;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText_content() {
        return text_content;
    }

    public void setText_content(String text_content) {
        this.text_content = text_content;
    }
}
