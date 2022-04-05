package com.mainapp.mo2.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - Constructor";
    }
}
