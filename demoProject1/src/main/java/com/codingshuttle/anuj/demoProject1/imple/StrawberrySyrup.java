package com.codingshuttle.anuj.demoProject1.imple;

import com.codingshuttle.anuj.demoProject1.backery.Syrup;
import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup implements Syrup {

    @Override
    public void getSyrup() {
        System.out.println("Strawberry Syrup");
    }
}
