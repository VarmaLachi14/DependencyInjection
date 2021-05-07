package com.spring.DependencyInjection.Controller;

import com.spring.DependencyInjection.Service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("propertyInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String Greeting(){
        return greetingService.sayGreeting();
    }

}
