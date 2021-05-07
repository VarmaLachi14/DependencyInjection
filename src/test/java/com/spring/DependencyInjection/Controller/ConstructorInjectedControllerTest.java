package com.spring.DependencyInjection.Controller;

import com.spring.DependencyInjection.Service.constructorInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new constructorInjectedGreetingServiceImpl());

    }

    @Test
    void greeting() {
        System.out.println(constructorInjectedController.Greeting());
    }
}