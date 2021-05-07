package com.spring.DependencyInjection.Service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hello World from Greeting Service   -> Implementation 1";
    }
}
