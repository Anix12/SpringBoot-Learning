package com.codingshuttle.anuj.demoProject1;

import com.codingshuttle.anuj.demoProject1.backery.Frosting;
import com.codingshuttle.anuj.demoProject1.backery.Syrup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBakers {

    Frosting frosting;
    Syrup syrup;

    @Autowired
    CakeBakers(@Qualifier("chocalateFrosting") Frosting frosting,@Qualifier("strawberrySyrup") Syrup syrup){
        this.frosting=frosting;
        this.syrup=syrup;
    }

}
