package com.codingshuttle.anuj.demoProject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;


// we implement whith demo class to run function {implements CommandLineRunner}
@SpringBootApplication
public class DemoProject1Application  {
//
//    @Autowired
//    CakeBakers bake;

    public static void main(String[] args) {
        SpringApplication.run(DemoProject1Application.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        bake.frosting.getFrosting();
//        bake.syrup.getSyrup();
//    }
}
