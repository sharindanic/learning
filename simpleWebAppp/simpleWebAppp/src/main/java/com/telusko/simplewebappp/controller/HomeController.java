package com.telusko.simplewebappp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to the server";
    }
    @RequestMapping("/about")
    public String about(){
        return "We dont care about ur opinion";
    }

}
