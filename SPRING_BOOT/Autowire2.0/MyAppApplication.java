package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(MyAppApplication.class, args); //runRunByInsideOfTheContainer

        Dev obj=context.getBean(Dev.class); //inject the dependency injection

        obj.build();
    }

}
