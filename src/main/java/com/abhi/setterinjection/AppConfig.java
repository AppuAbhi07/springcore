package com.abhi.setterinjection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public NotificationSender notificationSender() {
        return new NotificationSender();
    }

    @Bean
    public NotificationService notificationService(NotificationSender notificationSender) {
        NotificationService notificationService = new NotificationService();
        notificationService.setNotificationSender(notificationSender);
        return notificationService;
    }
}

