package com.spring.DependencyInjection.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ENPARENT")
@Service("i18Service")
public class i18nGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello parent i18n";
    }
}
