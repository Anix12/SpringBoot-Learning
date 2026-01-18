package com.codingshuttle.anuj.demoProject1.imple;

import com.codingshuttle.anuj.demoProject1.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String msg) {
        System.out.println("Sms Notify "+ msg);
    }
}
