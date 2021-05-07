package com.spring.DependencyInjection.Controller;

import com.spring.DependencyInjection.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class PropertyInjectedController {

    @Qualifier("constructorInjectedGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String Greeting(){
        return greetingService.sayGreeting();
    }
}
