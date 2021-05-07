package com.spring.DependencyInjection.Controller;

import com.spring.DependencyInjection.Service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    void greeting() {
        System.out.println(constructorInjectedController.Greeting());
    }
}