package com.mainapp.mo2.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"EN","default"})
@Service("i18GreetingService")
public class I18EnGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - From I18 service - EN profile ";
    }
}
