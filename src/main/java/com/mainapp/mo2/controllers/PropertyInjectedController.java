package com.mainapp.mo2.controllers;

import com.mainapp.mo2.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
