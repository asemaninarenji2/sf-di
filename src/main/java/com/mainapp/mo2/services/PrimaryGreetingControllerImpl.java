package com.mainapp.mo2.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryGreetingControllerImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From Primary Greeting Controller";
    }
}
