package com.codingshuttle.anuj.demoProject1.imple;

import com.codingshuttle.anuj.demoProject1.backery.Frosting;
import org.springframework.stereotype.Component;

@Component
public class ChocalateFrosting  implements Frosting {

    @Override
    public void getFrosting() {
        System.out.println("Chocalate Frosting");
    }

}
