package com.spring.DependencyInjection.Controller;

import com.spring.DependencyInjection.Service.constructorInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new constructorInjectedGreetingServiceImpl());
    }

    @Test
    void greeting() {
        System.out.println(setterInjectedController.Greeting());
    }
}