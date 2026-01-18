package com.codingshuttle.anuj.demoProject1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay() {
        System.out.println("Paying...");
    }

}
