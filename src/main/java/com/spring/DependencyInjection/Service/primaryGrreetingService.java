package com.spring.DependencyInjection.Service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class primaryGrreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World from Greeting Service   -> Primary Annotation";
    }
}
