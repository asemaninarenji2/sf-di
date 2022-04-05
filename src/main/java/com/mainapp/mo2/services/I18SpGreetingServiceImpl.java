package com.mainapp.mo2.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("SP")
@Service("i18GreetingService")
public class I18SpGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mondeo - From I18 Greeting Service SP profile";
    }
}
