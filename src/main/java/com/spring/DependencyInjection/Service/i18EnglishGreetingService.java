package com.spring.DependencyInjection.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18Service")
public class i18EnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello From Child of i18n";
    }
}
