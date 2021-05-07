package com.spring.DependencyInjection.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Introduction");
        return "Hi ,I am ALi";
    }
}
