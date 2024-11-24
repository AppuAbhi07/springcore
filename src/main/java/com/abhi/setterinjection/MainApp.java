package com.abhi.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        NotificationService notificationService = context.getBean(NotificationService.class);
        notificationService.notifyUser("Your order has been shipped!");
    }
}

