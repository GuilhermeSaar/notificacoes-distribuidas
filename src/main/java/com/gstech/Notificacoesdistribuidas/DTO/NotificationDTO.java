package com.gstech.Notificacoesdistribuidas.DTO;

import com.gstech.Notificacoesdistribuidas.enums.NotificationType;
import com.gstech.Notificacoesdistribuidas.enums.Recipient;

public record NotificationDTO(

        NotificationType notificationType,
        Recipient recipient,
        String title,
        String text_content
)
{}
