package com.spring.DependencyInjection.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from Greeting Service";
    }
}
