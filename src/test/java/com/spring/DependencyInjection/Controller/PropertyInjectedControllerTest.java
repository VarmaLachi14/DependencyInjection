package com.spring.DependencyInjection.Controller;

import com.spring.DependencyInjection.Service.constructorInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new constructorInjectedGreetingServiceImpl();
    }

    @Test
    void greeting() {
        System.out.println(controller.Greeting());
    }
}