package com.codingshuttle.anuj.demoProject1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basicImple {

    @GetMapping("abc")
    public String sayHello(){
        return "Hello Aniket";
    }

}
