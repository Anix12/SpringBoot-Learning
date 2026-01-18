package com.codingshuttle.anuj.demoProject1.imple;

import com.codingshuttle.anuj.demoProject1.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
//@ConditionalOnProperty(name = "notification.type", havingValue = "email") // it acts as if else condn take parameters from propertys
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String msg) {
        System.out.println("Email Notify " + msg);
    }
}
