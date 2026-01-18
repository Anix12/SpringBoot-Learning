package com.codingshuttle.anuj.demoProject1.imple;

import com.codingshuttle.anuj.demoProject1.backery.Syrup;
import org.springframework.stereotype.Component;

@Component
public class ChocalateSyrup implements Syrup {

    @Override
    public void getSyrup() {
        System.out.println("Chocalate Syrup");
    }
}
