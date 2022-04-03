package com.mainapp.mo2.controllers;

import com.mainapp.mo2.services.GreetingService;

public class ConstractorInjectedController {
    private final GreetingService greetingService;

    public ConstractorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
