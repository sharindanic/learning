package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class Dev{


    //@Qualifier("laptop")
    @Qualifier("laptop")
    @Autowired
    private Computer comp;

    public void build(){
        comp.compile();
        System.out.println("Working on a cool project ");

    }
}
