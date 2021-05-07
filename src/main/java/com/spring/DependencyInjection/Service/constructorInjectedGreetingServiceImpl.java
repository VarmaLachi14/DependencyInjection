package com.spring.DependencyInjection.Service;

import org.springframework.stereotype.Service;

@Service
public class constructorInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from Greeting Service   -> Implementation 2";
    }
}
