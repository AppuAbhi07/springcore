package com.abhi.setterinjection;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	private NotificationSender notificationSender;

	// Setter Injection
	public void setNotificationSender(NotificationSender notificationSender) {
		this.notificationSender = notificationSender;
	}

	public void notifyUser(String message) {
		notificationSender.sendNotification(message);
	}
}
